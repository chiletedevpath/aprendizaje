/* Concepto: DELETE sobre una fila sin relaciones dependientes. */

USE EMPRESAVENTAS;
GO

DELETE FROM dbo.Clientes WHERE ID_cliente = 4;

SELECT ID_cliente, Nombre_cliente
FROM dbo.Clientes
ORDER BY ID_cliente;
GO
