/* Concepto: capturar con TRY/CATCH un error generado por THROW. */

USE EMPRESAVENTAS;
GO

BEGIN TRY
    EXEC dbo.SP_InsertarCliente
        @ID_cliente = 6,
        @Nombre_cliente = 'Cliente Repetido',
        @Correo = 'cliente.cinco@example.test',
        @Telefono = NULL;
END TRY
BEGIN CATCH
    SELECT ERROR_NUMBER() AS numero_error,
           ERROR_MESSAGE() AS mensaje_error;
END CATCH;
GO
