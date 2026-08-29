-- Solución de referencia: compárala después de intentar el reto.
-- El índice compuesto mantiene primero la columna usada para filtrar.
CREATE INDEX ix_productos_categoria_precio
ON productos(categoria_id, precio);
