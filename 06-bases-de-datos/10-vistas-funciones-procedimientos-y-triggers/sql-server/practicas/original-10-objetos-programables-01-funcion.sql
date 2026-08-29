/* Concepto: funcion escalar reutilizable. */
USE EMPRESAVENTAS;
GO
CREATE OR ALTER FUNCTION dbo.FN_TotalItem (@Cantidad INT, @Precio DECIMAL(10,2))
RETURNS DECIMAL(12,2)
AS BEGIN RETURN @Cantidad * @Precio; END;
GO
SELECT ID_detalle, dbo.FN_TotalItem(Cantidad, Precio) AS subtotal FROM dbo.Items_pedido;
GO
