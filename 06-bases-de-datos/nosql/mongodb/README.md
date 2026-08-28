# MongoDB

Prácticas de modelado documental construidas a partir de los conceptos trabajados en ComidaPerucha, sin copiar el proyecto académico completo.

## Estado

**En desarrollo.** El primer laboratorio está preparado. MongoDB Server 8.3 fue detectado localmente, pero falta disponer de `mongosh` para ejecutarlo y documentar los resultados.

## Contenido actual

| Archivo | Enfoque |
|---|---|
| `01-inventario-documental.mongodb.js` | Documentos, categoría embebida, inserción, actualización, consulta, índice compuesto y agregación. |

La limpieza del script afecta únicamente a los documentos identificados como parte del laboratorio.

## Ejecución

```bash
mongosh "mongodb://localhost:27017" 01-inventario-documental.mongodb.js
```

## Criterio de avance

El bloque se marcará como **disponible** cuando se registren la versión del motor, los resultados y los índices creados, y pueda justificarse cuándo conviene embeber información o usar referencias.
