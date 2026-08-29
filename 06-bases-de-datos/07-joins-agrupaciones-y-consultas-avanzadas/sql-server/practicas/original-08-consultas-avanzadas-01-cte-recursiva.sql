/* Concepto: CTE normal y CTE recursiva. */
USE EMPRESAVENTAS;
GO
WITH Totales AS (
    SELECT ID_pedido, SUM(Cantidad * Precio) AS total
    FROM dbo.Items_pedido GROUP BY ID_pedido
)
SELECT ID_pedido, total FROM Totales ORDER BY ID_pedido;

WITH Numeros AS (
    SELECT 1 AS numero
    UNION ALL
    SELECT numero + 1 FROM Numeros WHERE numero < 5
)
SELECT numero FROM Numeros OPTION (MAXRECURSION 5);
GO
