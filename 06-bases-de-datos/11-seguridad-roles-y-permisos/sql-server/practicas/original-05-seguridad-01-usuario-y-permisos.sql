/* Concepto: usuario contenido, GRANT, EXECUTE AS, REVERT y REVOKE. */

USE EMPRESAVENTAS;
GO

IF USER_ID(N'Usuario_demo') IS NOT NULL DROP USER Usuario_demo;
GO
CREATE USER Usuario_demo WITHOUT LOGIN;
GRANT SELECT ON dbo.Clientes TO Usuario_demo;
GO

EXECUTE AS USER = 'Usuario_demo';
SELECT USER_NAME() AS usuario_en_ejecucion;
SELECT ID_cliente, Nombre_cliente FROM dbo.Clientes;
REVERT;
GO

REVOKE SELECT ON dbo.Clientes FROM Usuario_demo;
DROP USER Usuario_demo;
GO
