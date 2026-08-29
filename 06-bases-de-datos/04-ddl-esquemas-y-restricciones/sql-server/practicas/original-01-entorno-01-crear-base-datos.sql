/*
 * Concepto: crear una base de datos en SQL Server.
 * Este script no elimina ni reconstruye una base existente.
 */

USE master;
GO

IF DB_ID(N'EMPRESAVENTAS') IS NULL
BEGIN
    CREATE DATABASE EMPRESAVENTAS;
END;
GO

SELECT name, state_desc, recovery_model_desc
FROM sys.databases
WHERE name = N'EMPRESAVENTAS';
GO
