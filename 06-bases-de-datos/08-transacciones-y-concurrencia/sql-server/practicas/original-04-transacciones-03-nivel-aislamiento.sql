/* Concepto: consultar y definir el nivel de aislamiento de la sesion. */
USE EMPRESAVENTAS;
GO
SET TRANSACTION ISOLATION LEVEL READ COMMITTED;
DBCC USEROPTIONS WITH NO_INFOMSGS;
GO
