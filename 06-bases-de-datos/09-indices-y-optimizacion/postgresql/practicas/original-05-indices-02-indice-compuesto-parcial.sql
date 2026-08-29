-- Conceptos: indice compuesto, parcial y EXPLAIN ANALYZE.
CREATE INDEX IF NOT EXISTS idx_productos_activos_precio
ON aprendizaje.productos (activo, precio)
INCLUDE (codigo, nombre)
WHERE activo;

EXPLAIN (ANALYZE, BUFFERS)
SELECT codigo, nombre, precio
FROM aprendizaje.productos
WHERE activo AND precio >= 10
ORDER BY precio;
