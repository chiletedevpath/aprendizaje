/* Concepto: crear o actualizar un procedimiento almacenado parametrizado. */

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
        IF EXISTS (SELECT 1 FROM dbo.Clientes
                   WHERE ID_cliente = @ID_cliente OR Correo = @Correo)
            THROW 50001, 'El identificador o el correo ya estan registrados.', 1;
        INSERT INTO dbo.Clientes (ID_cliente, Nombre_cliente, Correo, Telefono)
        VALUES (@ID_cliente, @Nombre_cliente, @Correo, @Telefono);
        COMMIT TRANSACTION;
    END TRY
    BEGIN CATCH
        IF XACT_STATE() <> 0 ROLLBACK TRANSACTION;
        THROW;
    END CATCH;
END;
GO
