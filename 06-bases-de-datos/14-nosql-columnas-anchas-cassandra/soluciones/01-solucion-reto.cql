-- Solución de referencia: avances ordenados por fecha dentro de cada estudiante/curso.
CREATE KEYSPACE IF NOT EXISTS chilete_reto
WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

USE chilete_reto;

CREATE TABLE IF NOT EXISTS avances_por_estudiante_curso (
    estudiante_id text,
    curso_id text,
    fecha timestamp,
    tema text,
    porcentaje int,
    PRIMARY KEY ((estudiante_id, curso_id), fecha)
) WITH CLUSTERING ORDER BY (fecha DESC);

INSERT INTO avances_por_estudiante_curso
    (estudiante_id, curso_id, fecha, tema, porcentaje)
VALUES
    ('EST-001', 'DB-01', '2026-08-29T10:00:00Z', 'Modelado relacional', 60);

INSERT INTO avances_por_estudiante_curso
    (estudiante_id, curso_id, fecha, tema, porcentaje)
VALUES
    ('EST-001', 'DB-01', '2026-08-29T11:00:00Z', 'Consultas SQL', 80);

SELECT fecha, tema, porcentaje
FROM avances_por_estudiante_curso
WHERE estudiante_id = 'EST-001' AND curso_id = 'DB-01';
