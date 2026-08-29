/* Concepto: agrupar permisos mediante un rol de base de datos. */
USE EMPRESAVENTAS;
GO
IF USER_ID(N'Usuario_lector') IS NOT NULL DROP USER Usuario_lector;
IF DATABASE_PRINCIPAL_ID(N'rol_lectura_clientes') IS NOT NULL DROP ROLE rol_lectura_clientes;
GO
CREATE ROLE rol_lectura_clientes;
GRANT SELECT ON dbo.Clientes TO rol_lectura_clientes;
CREATE USER Usuario_lector WITHOUT LOGIN;
ALTER ROLE rol_lectura_clientes ADD MEMBER Usuario_lector;
EXECUTE AS USER = 'Usuario_lector';
SELECT COUNT(*) AS clientes_visibles FROM dbo.Clientes;
REVERT;
ALTER ROLE rol_lectura_clientes DROP MEMBER Usuario_lector;
DROP USER Usuario_lector;
DROP ROLE rol_lectura_clientes;
GO
