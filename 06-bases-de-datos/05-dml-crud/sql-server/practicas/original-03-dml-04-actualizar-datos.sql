/* Concepto: UPDATE con filtro y comprobacion posterior. */

USE EMPRESAVENTAS;
GO

UPDATE dbo.Clientes SET Telefono = '900000020' WHERE ID_cliente = 2;
UPDATE dbo.Pedidos SET Estado = 'Entregado' WHERE ID_pedido = 101;

SELECT ID_cliente, Nombre_cliente, Telefono
FROM dbo.Clientes WHERE ID_cliente = 2;
SELECT ID_pedido, Estado
FROM dbo.Pedidos WHERE ID_pedido = 101;
GO
