-- JOIN relaciona cada producto con su categoría.
SELECT c.nombre AS categoria, COUNT(*) AS productos, AVG(p.precio) AS precio_promedio
FROM aprendizaje.productos p
JOIN aprendizaje.categorias c ON c.id = p.categoria_id
GROUP BY c.nombre
HAVING COUNT(*) >= 1;
