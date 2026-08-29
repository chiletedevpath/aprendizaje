-- El índice parcial evita indexar filas que no participan en la consulta frecuente.
CREATE INDEX ix_productos_activos_categoria_precio
ON aprendizaje.productos(categoria_id, precio)
WHERE stock > 0;

EXPLAIN SELECT codigo, nombre, precio FROM aprendizaje.productos WHERE categoria_id = 1 AND stock > 0 ORDER BY precio;
