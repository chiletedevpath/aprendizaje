/* Conceptos: subconsultas, EXISTS y NOT EXISTS. */
USE EMPRESAVENTAS;
GO
SELECT ID_cliente, Nombre_cliente
FROM dbo.Clientes AS cliente
WHERE EXISTS (SELECT 1 FROM dbo.Pedidos AS pedido WHERE pedido.ID_cliente = cliente.ID_cliente)
ORDER BY ID_cliente;

SELECT ID_cliente, Nombre_cliente
FROM dbo.Clientes AS cliente
WHERE NOT EXISTS (SELECT 1 FROM dbo.Pedidos AS pedido WHERE pedido.ID_cliente = cliente.ID_cliente)
ORDER BY ID_cliente;
GO
