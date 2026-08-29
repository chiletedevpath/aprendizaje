-- Práctica: adapta este script al reto del README usando solo datos ficticios.
-- SAVEPOINT permite volver a un punto intermedio de la transacción.
SAVEPOINT antes_descuento;
UPDATE productos SET stock = stock - 1 WHERE codigo = 'LIB-001' AND stock >= 1;
-- COMMIT confirma los cambios cuando las validaciones externas fueron correctas.
COMMIT;
