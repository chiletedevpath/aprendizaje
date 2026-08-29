/* Solución de referencia: compárala después de intentar el reto. */
/* XACT_ABORT revierte la transacción ante determinados errores de ejecución. */
SET XACT_ABORT ON;
BEGIN TRANSACTION;
UPDATE dbo.Productos SET stock = stock - 1 WHERE codigo = 'LIB-001' AND stock >= 1;
IF @@ROWCOUNT = 0
BEGIN
    ROLLBACK TRANSACTION;
    THROW 50001, 'Stock insuficiente o producto inexistente.', 1;
END;
COMMIT TRANSACTION;
