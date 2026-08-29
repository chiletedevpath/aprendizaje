-- Conceptos: NULL, CASE y funciones de texto, fecha y numeros.
SELECT codigo, UPPER(nombre) AS nombre_mayusculas,
       COALESCE(stock, 0) AS stock,
       CURRENT_DATE - creado_en::date AS dias_creado,
       CASE WHEN stock = 0 THEN 'Agotado' WHEN stock < 10 THEN 'Bajo' ELSE 'Disponible' END AS estado_stock
FROM aprendizaje.productos
ORDER BY codigo;
