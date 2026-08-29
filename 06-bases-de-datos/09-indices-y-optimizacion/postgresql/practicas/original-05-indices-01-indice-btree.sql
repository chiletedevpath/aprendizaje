-- Concepto: crear un indice B-tree y revisar el plan de consulta.

CREATE INDEX IF NOT EXISTS idx_productos_categoria
    ON aprendizaje.productos (categoria_id);

EXPLAIN
SELECT codigo, nombre
FROM aprendizaje.productos
WHERE categoria_id = (
    SELECT id FROM aprendizaje.categorias WHERE nombre = 'Escritura'
);

SELECT indexname, indexdef
FROM pg_indexes
WHERE schemaname = 'aprendizaje'
  AND indexname = 'idx_productos_categoria';
