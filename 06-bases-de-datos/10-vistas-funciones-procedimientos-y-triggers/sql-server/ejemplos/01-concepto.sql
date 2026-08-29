/* La vista concentra una consulta reutilizable sin copiar datos. */
CREATE OR ALTER VIEW dbo.vw_productos_disponibles AS
SELECT codigo, nombre, precio, stock
FROM dbo.Productos
WHERE stock > 0;
GO

CREATE OR ALTER PROCEDURE dbo.actualizar_stock
    @codigo VARCHAR(20),
    @cantidad INT
AS
BEGIN
    SET NOCOUNT ON;

    UPDATE dbo.Productos
    SET stock = stock + @cantidad
    WHERE codigo = @codigo
      AND stock + @cantidad >= 0;

    IF @@ROWCOUNT = 0
        THROW 50002, 'Producto inexistente o stock resultante inválido.', 1;
END;
GO
GO
