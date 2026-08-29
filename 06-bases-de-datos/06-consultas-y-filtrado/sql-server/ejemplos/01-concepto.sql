/* SELECT enumera solo las columnas necesarias. */
SELECT codigo, nombre, precio, stock
FROM dbo.Productos
WHERE precio BETWEEN 20 AND 100 AND stock > 0
ORDER BY precio DESC;
