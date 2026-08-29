-- Solución de referencia: compárala después de intentar el reto.
-- pg_dump se ejecuta desde la terminal, no dentro de psql.
-- pg_dump -Fc -d chilete_aprendizaje -f chilete_aprendizaje.dump
-- pg_restore -d chilete_restaurada chilete_aprendizaje.dump

-- Esta consulta ayuda a validar el conteo después de restaurar.
SELECT COUNT(*) AS productos FROM aprendizaje.productos;
