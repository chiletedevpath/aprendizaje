/* =====================================================
      Procedimiento almacenado y manejo de errores
      Practica de participacion en clase
   ===================================================== */

USE EMPRESAVENTAS;
GO

/* =====================================================
      1. Procedimiento almacenado
   ===================================================== */

-- Inserta un cliente nuevo en la tabla Clientes.
CREATE OR ALTER PROCEDURE dbo.SP_InsertarCliente
    @ID_cliente INT,
    @Nombre_cliente VARCHAR(50),
    @Correo VARCHAR(40),
    @Telefono VARCHAR(20)
AS
BEGIN
    INSERT INTO Clientes (ID_cliente, Nombre_cliente, Correo, Telefono, Fecha_registro)
    VALUES (@ID_cliente, @Nombre_cliente, @Correo, @Telefono, GETDATE());

    PRINT 'Cliente insertado correctamente';
END;
GO

EXEC dbo.SP_InsertarCliente
    @ID_cliente = 5,
    @Nombre_cliente = 'Cliente Chilete DevPath',
    @Correo = 'cliente.chiletedevpath@example.test',
    @Telefono = '900000005';
GO

/* =====================================================
      2. TRY...CATCH para manejo de errores
   ===================================================== */

-- Este bloque genera un error porque Nombre_cliente no permite valores nulos.
BEGIN TRY

    UPDATE Clientes
    SET Nombre_cliente = NULL
    WHERE ID_cliente = 1;

    PRINT 'Cliente actualizado correctamente';

END TRY

BEGIN CATCH

    PRINT 'Ocurrio un error en la actualizacion';
    PRINT 'Mensaje del error: ' + ERROR_MESSAGE();

END CATCH;
GO
