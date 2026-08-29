-- Solución de referencia: compárala después de intentar el reto.
-- El rol agrupa permisos de lectura para no asignarlos usuario por usuario.
CREATE ROLE lector_reportes NOLOGIN;
GRANT USAGE ON SCHEMA aprendizaje TO lector_reportes;
GRANT SELECT ON aprendizaje.productos TO lector_reportes;
