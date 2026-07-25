# Bases de datos

Esta sección desarrolla modelado, bases de datos relacionales y bases de datos NoSQL. La ruta separa los conceptos comunes de las particularidades de cada motor.

## Objetivo

Diseñar modelos coherentes, implementar estructuras, consultar y modificar datos, aplicar controles básicos de seguridad y elegir una tecnología según el problema.

## Límite de publicación

Que una tecnología aparezca en la ruta no significa que su contenido ya esté aprobado. Los materiales recibidos deben pasar por revisión de autoría, seguridad, sintaxis, ejecución y valor didáctico antes de declararse publicables.

Consulta `estado-publicacion.md` para conocer el estado verificable de cada bloque.

## Prerrequisitos

- reconocer entidades, atributos y relaciones;
- comprender claves primarias y foráneas;
- diferenciar datos ficticios de información real;
- identificar instrucciones destructivas antes de ejecutar un script;
- utilizar una instancia local o una base exclusiva de práctica.

## Ruta sugerida

1. `modelado`: modelo entidad-relación y transformación al modelo lógico.
2. `sql-server`: DDL, DML, consultas, permisos, índices y procedimientos en T-SQL.
3. `postgresql`: prácticas específicas de PostgreSQL, después de ser recibidas y validadas.
4. `oracle`: prácticas específicas de Oracle Database, después de ser recibidas y validadas.
5. `mongodb`: documentos, consultas y agregaciones, después de ser recibidos y validados.
6. `cassandra`: modelado orientado a consultas y CQL, después de ser recibido y validado.
7. Comparación: justificar cuándo conviene un modelo relacional, documental o de columnas anchas.

## SQL y NoSQL

| Familia | Tecnología | Enfoque esperado | Estado |
|---|---|---|---|
| SQL | SQL Server | T-SQL, restricciones, consultas, seguridad e índices | Validado localmente; en evaluación editorial |
| SQL | PostgreSQL | SQL, esquemas, funciones, vistas e índices | Pendiente de contenido |
| SQL | Oracle Database | SQL, secuencias, PL/SQL y objetos del esquema | Pendiente de contenido |
| NoSQL documental | MongoDB | documentos, índices y agregaciones | Pendiente de contenido |
| NoSQL de columnas anchas | Apache Cassandra | particiones, clustering y CQL | Pendiente de contenido |

SQL Server, PostgreSQL y Oracle comparten fundamentos relacionales, pero no todos sus comandos son intercambiables. MongoDB y Cassandra tampoco deben agruparse como si utilizaran el mismo modelo.

## Material actual

- `glosario.md`: conceptos compartidos y diferencias esenciales.
- `ejercicios-comunidad.md`: retos propios posteriores a los ejemplos resueltos.
- `modelado`: diagramas y modelos lógico-relacionales.
- `sql-server/README.md`: contexto, orden de ejecución y evidencia de validación.
- `sql-server/ddl-dml-queries`: secuencia ejecutable de prácticas T-SQL.
- `estado-publicacion.md`: inventario de contenido validado y pendiente.

## Secuencia de SQL Server

1. `01-ddl-basico.sql`
2. `02-dml-basico.sql`
3. `03-seguridad-indices.sql`
4. `04-procedimientos-errores.sql`
5. `99-limpieza-opcional.sql`, únicamente si se desea eliminar la base de práctica.

## Criterio de logro

Puedes avanzar cuando logres:

- convertir un problema en un modelo con cardinalidades justificadas;
- crear restricciones que protejan la integridad;
- consultar relaciones sin depender de `SELECT *`;
- explicar el efecto de una transacción, un permiso y un índice;
- reconocer diferencias de dialecto entre motores SQL;
- justificar el modelo NoSQL desde sus patrones de acceso;
- ejecutar solo sobre datos ficticios y entornos controlados.

## Autoría y fuentes

El material publicable debe ser propio o estar correctamente atribuido. Los contenidos académicos deben convertirse en explicaciones y prácticas propias cuando el enunciado original no pueda compartirse.
