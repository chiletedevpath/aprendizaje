-- Solución de referencia: compárala después de intentar el reto.
-- SELECT enumera solo las columnas necesarias.
SELECT codigo, nombre, precio, stock
FROM productos
WHERE precio BETWEEN 20 AND 100 AND stock > 0
ORDER BY precio DESC;
