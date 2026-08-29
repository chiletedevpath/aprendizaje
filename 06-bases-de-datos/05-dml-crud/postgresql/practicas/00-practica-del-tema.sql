-- Práctica: adapta este script al reto del README usando solo datos ficticios.
-- WHERE limita el UPDATE a la fila prevista.
INSERT INTO aprendizaje.categorias(nombre) VALUES ('Libros');
INSERT INTO aprendizaje.productos(codigo,nombre,categoria_id,precio,stock) VALUES ('LIB-001','Algoritmos',1,49.90,10);
UPDATE aprendizaje.productos SET precio = 45.90 WHERE codigo = 'LIB-001';
UPDATE aprendizaje.productos SET activo = FALSE WHERE codigo = 'LIB-001';
