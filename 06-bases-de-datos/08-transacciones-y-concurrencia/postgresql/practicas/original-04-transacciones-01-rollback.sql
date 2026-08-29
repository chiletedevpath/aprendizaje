-- Concepto: transaccion explicita y ROLLBACK.

BEGIN;

UPDATE aprendizaje.productos
SET stock = 0
WHERE codigo = 'ESC-001';

SELECT codigo, stock
FROM aprendizaje.productos
WHERE codigo = 'ESC-001';

ROLLBACK;

SELECT codigo, stock
FROM aprendizaje.productos
WHERE codigo = 'ESC-001';
