-- Concepto: punto de guardado con SAVEPOINT.
BEGIN;
UPDATE aprendizaje.productos SET stock = 19 WHERE codigo = 'ESC-001';
SAVEPOINT antes_segundo_cambio;
UPDATE aprendizaje.productos SET stock = 7 WHERE codigo = 'ORG-001';
ROLLBACK TO SAVEPOINT antes_segundo_cambio;
SELECT codigo, stock FROM aprendizaje.productos ORDER BY codigo;
ROLLBACK;
