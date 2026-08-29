-- Solución de referencia: compárala después de intentar el reto.
-- WHERE limita el UPDATE a la fila prevista.
INSERT INTO categorias(nombre) VALUES ('Libros');
INSERT INTO productos(codigo,nombre,categoria_id,precio,stock) VALUES ('LIB-001','Algoritmos',1,49.90,10);
UPDATE productos SET precio = 45.90 WHERE codigo = 'LIB-001';
UPDATE productos SET activo = 0 WHERE codigo = 'LIB-001';
