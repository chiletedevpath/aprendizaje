# Casos comparativos

| Caso | Necesidad dominante | Opción razonable | Justificación resumida |
|---|---|---|---|
| Pagos y matrículas | Integridad, relaciones y transacciones | PostgreSQL / SQL Server / Oracle | El modelo relacional protege consistencia y relaciones. |
| Catálogo con campos variables | Documentos con estructura flexible y lectura conjunta | MongoDB | Los documentos pueden agrupar atributos y subdocumentos relacionados. |
| Telemetría distribuida por dispositivo y tiempo | Escritura distribuida y consultas conocidas por partición | Cassandra | El modelo se diseña para consultas y distribución horizontal. |

La tabla no sustituye un análisis real. Volumen, latencia, experiencia del equipo, operación y costos también influyen.
