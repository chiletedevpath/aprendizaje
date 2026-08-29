/* Concepto: SELECT, WHERE, LIKE y ORDER BY. */

USE EMPRESAVENTAS;
GO

SELECT ID_cliente, Nombre_cliente, Correo, Telefono
FROM dbo.Clientes
ORDER BY ID_cliente;

SELECT ID_cliente, Nombre_cliente
FROM dbo.Clientes
WHERE Nombre_cliente LIKE 'Cliente T%'
ORDER BY Nombre_cliente;

SELECT ID_cliente, Nombre_cliente, Fecha_registro
FROM dbo.Clientes
WHERE Fecha_registro = CAST(GETDATE() AS DATE)
ORDER BY ID_cliente;
GO
