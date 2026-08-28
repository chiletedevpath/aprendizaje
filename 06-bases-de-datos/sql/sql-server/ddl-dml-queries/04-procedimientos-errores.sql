/*
 * SQL Server - procedimientos almacenados y manejo de errores
 *
 * Prerrequisito: ejecutar 01-ddl-basico.sql y 02-dml-basico.sql.
 */

USE EMPRESAVENTAS;
GO

CREATE OR ALTER PROCEDURE dbo.SP_InsertarCliente
    @ID_cliente INT,
    @Nombre_cliente VARCHAR(50),
    @Correo VARCHAR(100),
    @Telefono VARCHAR(20) = NULL
AS
BEGIN
    SET NOCOUNT ON;
    SET XACT_ABORT ON;

    BEGIN TRY
        BEGIN TRANSACTION;

        IF EXISTS (
            SELECT 1
            FROM dbo.Clientes
            WHERE ID_cliente = @ID_cliente OR Correo = @Correo
        )
        BEGIN
            THROW 50001, 'El identificador o el correo ya están registrados.', 1;
        END;

        INSERT INTO dbo.Clientes
            (ID_cliente, Nombre_cliente, Correo, Telefono)
        VALUES
            (@ID_cliente, @Nombre_cliente, @Correo, @Telefono);

        COMMIT TRANSACTION;
    END TRY
    BEGIN CATCH
        IF XACT_STATE() <> 0
        BEGIN
            ROLLBACK TRANSACTION;
        END;
        THROW;
    END CATCH;
END;
GO

EXEC dbo.SP_InsertarCliente
    @ID_cliente = 5,
    @Nombre_cliente = 'Cliente Cinco',
    @Correo = 'cliente.cinco@example.test',
    @Telefono = '900000005';
GO

SELECT ID_cliente, Nombre_cliente, Correo, Telefono
FROM dbo.Clientes
WHERE ID_cliente = 5;
GO

-- Caso de error controlado: correo duplicado.
BEGIN TRY
    EXEC dbo.SP_InsertarCliente
        @ID_cliente = 6,
        @Nombre_cliente = 'Cliente Repetido',
        @Correo = 'cliente.cinco@example.test',
        @Telefono = NULL;
END TRY
BEGIN CATCH
    SELECT
        ERROR_NUMBER() AS numero_error,
        ERROR_MESSAGE() AS mensaje_error;
END CATCH;
GO
