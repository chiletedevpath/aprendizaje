-- Destructivo: elimina la base exclusiva de practica desde psql.
-- Ejecutar conectado a otra base, por ejemplo: postgres.

SELECT pg_terminate_backend(pid)
FROM pg_stat_activity
WHERE datname = 'chilete_devpath_pruebas'
  AND pid <> pg_backend_pid();

DROP DATABASE IF EXISTS chilete_devpath_pruebas;
