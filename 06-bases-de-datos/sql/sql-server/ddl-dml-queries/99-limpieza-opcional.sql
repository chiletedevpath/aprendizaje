/*
 * SQL Server - limpieza opcional
 *
 * ADVERTENCIA: elimina por completo la base EMPRESAVENTAS.
 * Ejecutar únicamente cuando ya no se necesiten las evidencias de práctica.
 */

USE master;
GO

IF DB_ID(N'EMPRESAVENTAS') IS NOT NULL
BEGIN
    ALTER DATABASE EMPRESAVENTAS
        SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
    DROP DATABASE EMPRESAVENTAS;
END;
GO
