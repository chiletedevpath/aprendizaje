-- Concepto: SELECT, WHERE, BETWEEN, LIKE y ORDER BY.

SELECT codigo, nombre, precio, stock
FROM aprendizaje.productos
WHERE activo
ORDER BY nombre;

SELECT codigo, nombre, precio
FROM aprendizaje.productos
WHERE precio BETWEEN 10 AND 20
  AND nombre LIKE '%practica%'
ORDER BY precio;
