/* Conceptos: LEFT JOIN y filas sin correspondencia. */
USE EMPRESAVENTAS;
GO
SELECT cliente.ID_cliente, cliente.Nombre_cliente, pedido.ID_pedido, pedido.Estado
FROM dbo.Clientes AS cliente
LEFT JOIN dbo.Pedidos AS pedido ON pedido.ID_cliente = cliente.ID_cliente
ORDER BY cliente.ID_cliente, pedido.ID_pedido;
GO
