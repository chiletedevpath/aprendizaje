-- Concepto: JOIN, GROUP BY y funciones de agregacion.

SELECT categoria.nombre AS categoria,
       COUNT(*) AS productos,
       SUM(producto.stock) AS unidades,
       SUM(producto.precio * producto.stock) AS valor_total
FROM aprendizaje.productos AS producto
JOIN aprendizaje.categorias AS categoria
  ON categoria.id = producto.categoria_id
WHERE producto.activo
GROUP BY categoria.nombre
ORDER BY categoria.nombre;
