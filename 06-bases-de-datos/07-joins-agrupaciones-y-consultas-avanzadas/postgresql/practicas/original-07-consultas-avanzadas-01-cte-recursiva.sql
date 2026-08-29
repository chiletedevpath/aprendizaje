-- Concepto: CTE normal y CTE recursiva.
WITH inventario AS (
    SELECT categoria_id, SUM(stock) AS unidades
    FROM aprendizaje.productos GROUP BY categoria_id
)
SELECT categoria.nombre, inventario.unidades
FROM inventario JOIN aprendizaje.categorias AS categoria ON categoria.id = inventario.categoria_id;

WITH RECURSIVE numeros(numero) AS (
    VALUES (1)
    UNION ALL
    SELECT numero + 1 FROM numeros WHERE numero < 5
)
SELECT numero FROM numeros;
