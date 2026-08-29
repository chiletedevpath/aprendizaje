/* Conceptos: UNION, INTERSECT y EXCEPT. */
USE EMPRESAVENTAS;
GO
SELECT ID_cliente FROM dbo.Clientes WHERE ID_cliente <= 2
UNION
SELECT ID_cliente FROM dbo.Pedidos WHERE Estado = 'Pendiente';

SELECT ID_cliente FROM dbo.Clientes
INTERSECT
SELECT ID_cliente FROM dbo.Pedidos;

SELECT ID_cliente FROM dbo.Clientes
EXCEPT
SELECT ID_cliente FROM dbo.Pedidos;
GO
