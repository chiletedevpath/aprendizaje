-- La clave de partición agrupa todos los avances de un estudiante y curso.
CREATE KEYSPACE IF NOT EXISTS chilete_devpath
WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

USE chilete_devpath;

CREATE TABLE IF NOT EXISTS avances_por_estudiante_curso (
    estudiante_id text,
    curso_id text,
    fecha timestamp,
    tema text,
    porcentaje int,
    PRIMARY KEY ((estudiante_id, curso_id), fecha)
) WITH CLUSTERING ORDER BY (fecha DESC);

-- La consulta respeta la clave de partición definida por el modelo.
SELECT fecha, tema, porcentaje
FROM avances_por_estudiante_curso
WHERE estudiante_id = 'EST-001' AND curso_id = 'DB-01';
