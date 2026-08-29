/* Concepto: transaccion explicita y ROLLBACK. Los cambios se revierten. */

USE EMPRESAVENTAS;
GO

BEGIN TRANSACTION;

DELETE FROM dbo.Items_pedido WHERE ID_pedido = 103;
DELETE FROM dbo.Pedidos WHERE ID_pedido = 103;
DELETE FROM dbo.Clientes WHERE ID_cliente = 3;

SELECT ID_cliente, Nombre_cliente FROM dbo.Clientes ORDER BY ID_cliente;

ROLLBACK TRANSACTION;

SELECT ID_cliente, Nombre_cliente FROM dbo.Clientes ORDER BY ID_cliente;
GO
