-- Concepto: UPDATE con RETURNING.

UPDATE aprendizaje.productos
SET precio = 12.50, stock = 20
WHERE codigo = 'ESC-001'
RETURNING codigo, nombre, precio, stock;
