-- Concepto: crear una base de datos desde psql.
-- Ejecutar conectado a cualquier base existente, por ejemplo: postgres.

SELECT 'CREATE DATABASE chilete_devpath_pruebas'
WHERE NOT EXISTS (
    SELECT 1 FROM pg_database WHERE datname = 'chilete_devpath_pruebas'
)\gexec

SELECT datname, datallowconn
FROM pg_database
WHERE datname = 'chilete_devpath_pruebas';
