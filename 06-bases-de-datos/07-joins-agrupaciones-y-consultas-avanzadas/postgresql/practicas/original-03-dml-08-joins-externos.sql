-- Conceptos: LEFT JOIN y filas sin correspondencia.
SELECT categoria.nombre AS categoria, producto.codigo, producto.nombre AS producto
FROM aprendizaje.categorias AS categoria
LEFT JOIN aprendizaje.productos AS producto ON producto.categoria_id = categoria.id
ORDER BY categoria.nombre, producto.codigo;
