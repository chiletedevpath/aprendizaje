# Solución de referencia

1. **Sistema de matrículas:** relacional, porque necesita integridad referencial y transacciones consistentes.
2. **Catálogo de contenidos con metadatos variables:** MongoDB puede ser adecuado si los documentos se leen como una unidad y el esquema cambia con frecuencia.
3. **Eventos masivos por dispositivo y fecha:** Cassandra puede ser adecuada cuando las consultas están definidas de antemano y la distribución horizontal es prioritaria.

La respuesta correcta no es solo el nombre del motor: debe incluir los requisitos que justifican la elección.
