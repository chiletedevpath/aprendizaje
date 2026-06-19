/* =====================================================
                  TAREA SP Y TRY CATCH
                 PARTICIPACION EN CLASE
   ===================================================== */

USE EMPRESAVENTAS;
GO

/* =====================================================
      1.- PROCEDIMIENTO ALMACENADO (SP)
   ===================================================== */

-- Este SP sirve para insertar un nuevo cliente en la tabla Clientes2
CREATE OR ALTER PROCEDURE dbo.SP_InsertarCliente
    @Nombre VARCHAR(50),
    @Correo VARCHAR(40),
    @Telefono VARCHAR(20)
AS
BEGIN
    INSERT INTO Clientes2 (Nombre, Correo, Telefono, Fecha_registro)
    VALUES (@Nombre, @Correo, @Telefono, GETDATE());

    PRINT 'Cliente insertado correctamente';
END;
GO

-- Probando el procedimiento almacenado
EXEC dbo.SP_InsertarCliente 
    @Nombre = 'Cliente de prueba',
    @Correo = 'cliente.prueba@example.test',
    @Telefono = '900000001';
GO


/* =====================================================
      2.- TRY – CATCH (MANEJO DE ERRORES)
   ===================================================== */

-- Voy actualizar un cliente a NULL
-- Esto genera un error porque la columna Nombre_cliente no permite valores nulos

BEGIN TRY

    UPDATE Clientes
    SET Nombre_cliente = NULL  -- Aquí ocurre el error
    WHERE ID_cliente = 1;

    PRINT 'Cliente actualizado correctamente';

END TRY

BEGIN CATCH

    PRINT 'Ocurrió un error en la actualización';
    PRINT 'Mensaje del error: ' + ERROR_MESSAGE();

END CATCH;
GO
