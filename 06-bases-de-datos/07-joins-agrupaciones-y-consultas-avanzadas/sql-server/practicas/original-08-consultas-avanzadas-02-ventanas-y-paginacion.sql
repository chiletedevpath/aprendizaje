/* Conceptos: funciones de ventana y paginacion. */
USE EMPRESAVENTAS;
GO
SELECT ID_pedido, ID_cliente, Fecha,
       ROW_NUMBER() OVER (ORDER BY Fecha, ID_pedido) AS fila,
       RANK() OVER (PARTITION BY ID_cliente ORDER BY Fecha) AS orden_cliente,
       LAG(ID_pedido) OVER (ORDER BY Fecha, ID_pedido) AS pedido_anterior
FROM dbo.Pedidos;

SELECT ID_pedido, ID_cliente, Estado
FROM dbo.Pedidos
ORDER BY ID_pedido
OFFSET 0 ROWS FETCH NEXT 2 ROWS ONLY;
GO
