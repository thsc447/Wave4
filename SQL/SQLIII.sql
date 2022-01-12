-- noinspection SqlNoDataSourceInspectionForFile

-- noinspection SqlDialectInspectionForFile

/*Explique o conceito de normalização e para que é usado.*/

É o processo de organização dos dados, afim de evitar problemas de problemas incogruencia.
/*Adicione um filme à tabela de filmes.*/

INSERT INTO movies (title, rating, awards, release_date, length, genre_id)
VALUES ('novo filme', '10', '99', '1999-01-04', 223, 4);
/*Adicione um gênero à tabela de gêneros.*/

INSERT INTO genres (name, ranking, active)
VALUES ('Mockentar7', 0, 1);
/*Associe o filme do Ex 2. ao gênero criado no Ex. 3.*/

UPDATE movies SET genre_id = 13 WHERE id = 13;
/*Modifique a tabela de atores para que pelo menos um ator tenha como favorito o filme adicionado no Ex. 2.*/

UPDATE actors SET favorite_movie_id = 13 WHERE id = 3;
/*Crie uma cópia temporária da tabela de filmes.*/

CREATE TEMP TABLE temp_movies as (SELECT * FROM movies);
/*Elimine desta tabela temporária todos os filmes que ganharam menos de 5 prêmios.*/

DELETE FROM temp_movies WHERE COUNT(awards > 5);
/*Obtenha a lista de todos os gêneros que possuem pelo menos um filme.*/

SELECT g.name, COUNT(m.awards)
FROM movies m
JOIN genres g on (m.genre_id = g.id)
GROUP BY g.name
HAVING COUNT(m.awards) > 1;
/*Obtenha a lista de atores cujo filme favorito ganhou mais de 3 prêmios.*/

SELECT a.first_name,a.last_name, m.title,COUNT(m.awards)
FROM movies m
JOIN actors a on (a.favorite_movie_id = m.id)
GROUP BY a.first_name,m.title, a.last_name, m.awards
HAVING COUNT(m.awards) > 1;
/*Use o plano de execução para analisar as consultas nos Ex 6 e 7.*/
EXPLAIN CREATE TEMP TABLE temp_movies as (SELECT * FROM movies);

EXPLAIN DELETE FROM temp_movies WHERE COUNT(awards > 5);

EXPLAIN SELECT a.first_name,a.last_name, m.title,COUNT(m.awards)
        FROM movies m
        JOIN actors a on (a.favorite_movie_id = m.id)
        GROUP BY a.first_name,m.title, a.last_name, m.awards
        HAVING COUNT(m.awards) > 1;
/*O que são os índices? Para que servem?*/

São a posição física de determinado dado da tabela. Servem para agilizar consultas em tabelas massivas
/*Crie um índice sobre o nome na tabela de filmes.*/

CREATE INDEX idx_movies on movies(title);
/*Verifique se o índice foi criado corretamente.*/

EXPLAIN SELECT title FROM movies;
DROP INDEX idx_movies;
EXPLAIN SELECT title FROM movies;

Com uma quantidade grande de dados, esse comando retornará a diferenca entre a consulta com o indice e sem o indice criado