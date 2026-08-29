/* JOIN relaciona cada producto con su categoría. */
SELECT c.nombre AS categoria, COUNT(*) AS productos, AVG(p.precio) AS precio_promedio
FROM dbo.Productos p
INNER JOIN dbo.Categorias c ON c.id = p.categoria_id
GROUP BY c.nombre
HAVING COUNT(*) >= 1;
