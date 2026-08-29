/* Concepto: comparar una consulta antes y despues de un indice no agrupado. */

USE EMPRESAVENTAS;
GO

DROP INDEX IF EXISTS IX_Clientes_Nombre ON dbo.Clientes;
SET STATISTICS IO ON;
SET STATISTICS TIME ON;
GO
SELECT ID_cliente, Nombre_cliente, Correo
FROM dbo.Clientes
WHERE Nombre_cliente LIKE 'Cliente T%';
GO

CREATE NONCLUSTERED INDEX IX_Clientes_Nombre
ON dbo.Clientes (Nombre_cliente)
INCLUDE (Correo);
GO
SELECT ID_cliente, Nombre_cliente, Correo
FROM dbo.Clientes
WHERE Nombre_cliente LIKE 'Cliente T%';
GO
SET STATISTICS IO OFF;
SET STATISTICS TIME OFF;
GO
