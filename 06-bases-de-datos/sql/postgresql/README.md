# PostgreSQL

Prácticas de PostgreSQL separadas del proyecto académico ComidaPerucha para estudiar cada concepto con un caso pequeño y datos ficticios.

## Estado

**En desarrollo.** El primer laboratorio está preparado. PostgreSQL 18 acepta conexiones locales, pero falta autenticar una base exclusiva de práctica, ejecutar el script dos veces y documentar los resultados.

## Contenido actual

| Archivo | Enfoque |
|---|---|
| `01-inventario-academico.sql` | Esquema, tablas relacionadas, restricciones, carga repetible, índice, vista y consultas. |
| `99-limpieza-opcional.sql` | Eliminación controlada del esquema creado por el laboratorio. |

## Ejecución

Usa una base exclusiva de práctica y reemplaza el usuario y el nombre de la base:

```bash
psql -U USUARIO -d BASE_PRACTICA -f 01-inventario-academico.sql
```

El archivo de limpieza es destructivo y debe ejecutarse solo cuando se quiera retirar el laboratorio completo.

## Criterio de avance

El bloque se marcará como **disponible** cuando el laboratorio se ejecute dos veces sin errores, se registren la versión del motor y los resultados, y puedan explicarse las restricciones, la transacción, el índice y la vista.
