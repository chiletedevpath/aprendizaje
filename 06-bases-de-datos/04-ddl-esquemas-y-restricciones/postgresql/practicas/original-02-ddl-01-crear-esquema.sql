-- Concepto: crear y seleccionar un esquema de trabajo.
-- Prerrequisito: conectarse a chilete_devpath_pruebas.

CREATE SCHEMA IF NOT EXISTS aprendizaje;

SELECT schema_name
FROM information_schema.schemata
WHERE schema_name = 'aprendizaje';
