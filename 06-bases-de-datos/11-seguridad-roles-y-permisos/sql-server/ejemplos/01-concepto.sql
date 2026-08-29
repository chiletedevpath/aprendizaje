/* El rol agrupa permisos de lectura para no asignarlos usuario por usuario. */
CREATE ROLE lector_reportes;
GRANT SELECT ON dbo.Productos TO lector_reportes;
