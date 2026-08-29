-- Conceptos: UNION, INTERSECT y EXCEPT.
SELECT codigo FROM aprendizaje.productos WHERE stock >= 10
UNION
SELECT codigo FROM aprendizaje.productos WHERE precio >= 15;

SELECT codigo FROM aprendizaje.productos WHERE activo
INTERSECT
SELECT codigo FROM aprendizaje.productos WHERE stock > 0;

SELECT codigo FROM aprendizaje.productos
EXCEPT
SELECT codigo FROM aprendizaje.productos WHERE activo;
