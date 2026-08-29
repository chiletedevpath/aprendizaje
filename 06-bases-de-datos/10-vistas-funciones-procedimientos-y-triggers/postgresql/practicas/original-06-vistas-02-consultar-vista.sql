-- Concepto: consultar y agrupar datos expuestos por una vista.

SELECT categoria,
       COUNT(*) AS productos,
       SUM(stock) AS unidades,
       SUM(valor_inventario) AS valor_total
FROM aprendizaje.vw_inventario
GROUP BY categoria
ORDER BY categoria;
