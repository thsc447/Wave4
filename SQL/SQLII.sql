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



