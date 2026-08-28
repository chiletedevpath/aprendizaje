# Estado de evaluación y publicación

Esta matriz evita presentar como terminada una tecnología que todavía no cuenta con material revisado.

| Bloque | Contenido disponible | Validación pendiente | Estado editorial |
|---|---|---|---|
| Modelado | Diagramas ER y tres modelos lógicos orientados a SQL Server | revisar cardinalidades contra sus enunciados originales y renderizar los diagramas | En evaluación |
| SQL Server | DDL, DML, consultas, permisos, índices, procedimientos y manejo de errores | revisar el origen editorial de cada ejercicio | Validado en SQL Server 16.0.1190.2; en evaluación editorial |
| PostgreSQL | Laboratorio inicial propio de esquema, integridad, consultas, vista, índice y transacción | PostgreSQL 18 acepta conexiones locales, pero falta autenticar una base exclusiva, ejecutar dos veces y registrar resultados | En desarrollo; validación local pendiente |
| Oracle Database | Sin prácticas incorporadas en esta sección | recibir, revisar autoría, adaptar datos y ejecutar | Pendiente de contenido |
| MongoDB | Laboratorio inicial propio de documentos, CRUD, índice y agregación | MongoDB Server 8.3 está disponible localmente, pero falta instalar o habilitar `mongosh`, ejecutar y registrar resultados | En desarrollo; validación local pendiente |
| Apache Cassandra | Sin prácticas incorporadas en esta sección | recibir, revisar autoría, validar modelo por consultas y CQL | Pendiente de contenido |

## Condiciones para aprobar un bloque

1. Propósito y prerrequisitos explícitos.
2. Datos exclusivamente ficticios.
3. Comandos identificados por motor y contexto de ejecución.
4. Casos normales, límites y errores esperados.
5. Instrucciones destructivas aisladas y advertidas.
6. Ejecución reproducible en una versión documentada del motor.
7. Fuentes y autoría revisadas.
8. Ejercicio resuelto, reto y evidencia de laboratorio cuando corresponda.

Hasta cumplir estas condiciones, el bloque permanece como contenido en evaluación y no como práctica validada de Chilete DevPath.

## Evidencia académica relacionada

El proyecto ComidaPerucha BD Backend, conservado en `academia`, demuestra trabajo previo con PostgreSQL y MongoDB. Esa evidencia no se copia como si fuera una guía: sirve como punto de partida para crear laboratorios pequeños, genéricos y explicables dentro de `aprendizaje`.

Oracle Database y Apache Cassandra permanecen planificados hasta que existan prácticas propias estudiadas y ejecutadas.
