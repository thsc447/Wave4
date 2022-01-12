/* 1 - Join é uma função de agregação que recebe dois ou mais paremetros e retorn a junção dessas tabelas */

/* 2 - Inner Join - Recebe dois parametros e retorna os resultados que estão em ambos as tabelas */
/* 2 - Left Join - Recebe dois parametros e retorna os resultados que estão em ambos as tabela passada a direita e todos os resultados da tabela a esquerda */

/* 3 - Group by é utilizado para informar ao SQL qual coluna ele utilizara para agrupar uma consulta */

/* 4 - Having é utilizado para filtrar uma agragação. Como se fosse um if */

/* 5 - Inner Join e Right Join */

/* 6 - SELECT * FROM A RIGHT INNER JOIN B | SELECT * FROM A FULL OUTER JOIN B/

/* -------------- */
/* EX02 */
/* -------------- */

/*Mostre o título e o nome do gênero de todas as séries.*/
SELECT s.title, g.name from series s join genres g on (s.genre_id = g.id);

/*Mostre o título dos episódios, os nomes e sobrenomes dos atores que
  atuam em cada um deles.*/

 SELECT e.title, a.first_name, a.last_name
 FROM actor_episode ae
 JOIN episodes e on (ae.episode_id = e.id)
 JOIN actors a on (ae.actor_id = a.id);

 /*Mostre o título de todas as séries e o número total de temporadas que
   cada uma delas possui.*/

SELECT s.title, COUNT(se.title)
FROM series s
JOIN seasons se on (s.id = se.serie_id)
GROUP BY s.title;

/*Mostre o nome de todos os gêneros e o número total de filmes de cada
  um, desde que seja maior ou igual a 3.*/

  SELECT g.name, COUNT(m.title)
  FROM genres g
  JOIN movies m on (g.id = m.genre_id)
  GROUP BY g.name
  HAVING COUNT(m.title) > 3;



