/* Concepto: ejecutar un procedimiento con parametros nominales. */

USE EMPRESAVENTAS;
GO

DELETE FROM dbo.Clientes WHERE ID_cliente = 5;
EXEC dbo.SP_InsertarCliente
    @ID_cliente = 5,
    @Nombre_cliente = 'Cliente Cinco',
    @Correo = 'cliente.cinco@example.test',
    @Telefono = '900000005';

SELECT ID_cliente, Nombre_cliente, Correo, Telefono
FROM dbo.Clientes
WHERE ID_cliente = 5;
GO
