/* Concepto: punto de guardado con SAVE TRANSACTION. */
USE EMPRESAVENTAS;
GO
BEGIN TRANSACTION;
UPDATE dbo.Clientes SET Telefono = '900000099' WHERE ID_cliente = 1;
SAVE TRANSACTION antes_segundo_cambio;
UPDATE dbo.Clientes SET Telefono = '900000098' WHERE ID_cliente = 2;
ROLLBACK TRANSACTION antes_segundo_cambio;
SELECT ID_cliente, Telefono FROM dbo.Clientes WHERE ID_cliente IN (1, 2);
ROLLBACK TRANSACTION;
GO
