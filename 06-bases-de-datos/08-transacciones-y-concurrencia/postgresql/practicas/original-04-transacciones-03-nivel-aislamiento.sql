-- Concepto: consultar y definir el nivel de aislamiento de una transaccion.
BEGIN TRANSACTION ISOLATION LEVEL READ COMMITTED;
SHOW transaction_isolation;
SELECT COUNT(*) AS productos_visibles FROM aprendizaje.productos;
COMMIT;
