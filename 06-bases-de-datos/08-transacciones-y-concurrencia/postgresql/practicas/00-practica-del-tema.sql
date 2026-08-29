-- Práctica: adapta este script al reto del README usando solo datos ficticios.
-- La condición evita producir stock negativo.
BEGIN;
UPDATE aprendizaje.productos
SET stock = stock - 1
WHERE codigo = 'LIB-001' AND stock >= 1;
-- La aplicación debe verificar que exactamente una fila fue actualizada.
COMMIT;
