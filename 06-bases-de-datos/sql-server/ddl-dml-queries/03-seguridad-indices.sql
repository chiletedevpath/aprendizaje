/*
 * SQL Server - permisos e índices
 *
 * Prerrequisitos:
 *   1. Ejecutar 01-ddl-basico.sql y 02-dml-basico.sql.
 *   2. Usar una cuenta autorizada para CREATE USER, GRANT y REVOKE.
 */

USE EMPRESAVENTAS;
GO

IF USER_ID(N'Usuario_demo') IS NOT NULL
BEGIN
    DROP USER Usuario_demo;
END;
GO

CREATE USER Usuario_demo WITHOUT LOGIN;
GO

GRANT SELECT ON dbo.Clientes TO Usuario_demo;
GO

EXECUTE AS USER = 'Usuario_demo';
SELECT USER_NAME() AS usuario_en_ejecucion;
SELECT ID_cliente, Nombre_cliente
FROM dbo.Clientes;
REVERT;
GO

REVOKE SELECT ON dbo.Clientes FROM Usuario_demo;
DROP USER Usuario_demo;
GO

-- Comparación didáctica de una consulta antes y después del índice.
DROP INDEX IF EXISTS IX_Clientes_Nombre ON dbo.Clientes;
GO

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
