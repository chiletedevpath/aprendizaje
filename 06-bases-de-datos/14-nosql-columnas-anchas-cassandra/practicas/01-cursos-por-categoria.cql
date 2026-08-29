-- Práctica: diseña la tabla desde la consulta "cursos activos por categoría".
CREATE KEYSPACE IF NOT EXISTS chilete_practica
WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

USE chilete_practica;

CREATE TABLE IF NOT EXISTS cursos_activos_por_categoria (
    categoria text,
    titulo text,
    curso_id text,
    activo boolean,
    PRIMARY KEY ((categoria), titulo, curso_id)
);

INSERT INTO cursos_activos_por_categoria (categoria, titulo, curso_id, activo)
VALUES ('datos', 'Bases de datos', 'DB-01', true);

SELECT titulo, curso_id, activo
FROM cursos_activos_por_categoria
WHERE categoria = 'datos';
