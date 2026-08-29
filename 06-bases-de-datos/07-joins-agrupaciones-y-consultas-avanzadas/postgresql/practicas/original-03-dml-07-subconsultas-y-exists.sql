-- Conceptos: subconsultas, EXISTS y NOT EXISTS.
SELECT categoria.id, categoria.nombre
FROM aprendizaje.categorias AS categoria
WHERE EXISTS (SELECT 1 FROM aprendizaje.productos AS producto WHERE producto.categoria_id = categoria.id)
ORDER BY categoria.id;

SELECT categoria.id, categoria.nombre
FROM aprendizaje.categorias AS categoria
WHERE NOT EXISTS (SELECT 1 FROM aprendizaje.productos AS producto WHERE producto.categoria_id = categoria.id)
ORDER BY categoria.id;
