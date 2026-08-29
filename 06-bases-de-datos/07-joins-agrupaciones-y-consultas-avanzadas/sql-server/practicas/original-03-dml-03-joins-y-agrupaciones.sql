/* Concepto: INNER JOIN, GROUP BY y funciones de agregacion. */

USE EMPRESAVENTAS;
GO

SELECT pedido.ID_pedido, cliente.Nombre_cliente, pedido.Estado,
       SUM(item.Cantidad * item.Precio) AS total_pedido
FROM dbo.Pedidos AS pedido
INNER JOIN dbo.Clientes AS cliente ON cliente.ID_cliente = pedido.ID_cliente
INNER JOIN dbo.Items_pedido AS item ON item.ID_pedido = pedido.ID_pedido
GROUP BY pedido.ID_pedido, cliente.Nombre_cliente, pedido.Estado
ORDER BY pedido.ID_pedido;
GO
