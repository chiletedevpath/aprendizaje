-- Conceptos: funciones de ventana y paginacion.
SELECT codigo, categoria_id, precio,
       ROW_NUMBER() OVER (ORDER BY precio DESC, codigo) AS fila,
       RANK() OVER (PARTITION BY categoria_id ORDER BY precio DESC) AS posicion_categoria,
       LAG(precio) OVER (ORDER BY precio, codigo) AS precio_anterior
FROM aprendizaje.productos;

SELECT codigo, nombre, precio
FROM aprendizaje.productos
ORDER BY codigo
LIMIT 1 OFFSET 0;
