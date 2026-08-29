-- Concepto: crear o reemplazar una vista.

CREATE OR REPLACE VIEW aprendizaje.vw_inventario AS
SELECT producto.codigo,
       producto.nombre AS producto,
       categoria.nombre AS categoria,
       producto.precio,
       producto.stock,
       producto.precio * producto.stock AS valor_inventario
FROM aprendizaje.productos AS producto
JOIN aprendizaje.categorias AS categoria
  ON categoria.id = producto.categoria_id
WHERE producto.activo;

SELECT *
FROM aprendizaje.vw_inventario
ORDER BY categoria, producto;
