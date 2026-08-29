-- Solución de referencia: compárala después de intentar el reto.
-- El rol agrupa permisos de lectura para no asignarlos usuario por usuario.
CREATE ROLE lector_reportes;
GRANT SELECT ON productos TO lector_reportes;
