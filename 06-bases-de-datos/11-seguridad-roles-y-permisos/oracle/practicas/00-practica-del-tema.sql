-- Práctica: adapta este script al reto del README usando solo datos ficticios.
-- El rol agrupa permisos de lectura para no asignarlos usuario por usuario.
CREATE ROLE lector_reportes;
GRANT SELECT ON productos TO lector_reportes;
