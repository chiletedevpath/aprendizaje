-- Concepto: funcion SQL reutilizable.
CREATE OR REPLACE FUNCTION aprendizaje.calcular_valor(p_precio NUMERIC, p_stock INTEGER)
RETURNS NUMERIC LANGUAGE sql IMMUTABLE
RETURN p_precio * p_stock;

SELECT codigo, aprendizaje.calcular_valor(precio, stock) AS valor
FROM aprendizaje.productos ORDER BY codigo;
