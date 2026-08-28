# Bases de datos

Esta sección desarrolla modelado, bases de datos relacionales y bases de datos NoSQL. La ruta separa los conceptos comunes de las particularidades de cada motor.

## Objetivo

Diseñar modelos coherentes, implementar estructuras, consultar y modificar datos, aplicar controles básicos de seguridad y elegir una tecnología según el problema.

## Límite de publicación

Que una tecnología aparezca en la ruta no significa que su contenido ya esté aprobado. Los materiales recibidos deben pasar por revisión de autoría, seguridad, sintaxis, ejecución y valor didáctico antes de declararse publicables.

Consulta `estado-publicacion.md` para conocer el estado verificable de cada bloque.

## Estructura

```text
06-bases-de-datos/
├── modelado/
├── sql/
│   ├── sql-server/
│   ├── postgresql/
│   └── oracle/
└── nosql/
    ├── mongodb/
    └── cassandra/
```

`modelado` permanece como base común porque el análisis de entidades, relaciones y patrones de acceso ocurre antes de elegir un motor.

## Prerrequisitos

- reconocer entidades, atributos y relaciones;
- comprender claves primarias y foráneas;
- diferenciar datos ficticios de información real;
- identificar instrucciones destructivas antes de ejecutar un script;
- utilizar una instancia local o una base exclusiva de práctica.

## Ruta sugerida

1. `modelado`: modelo entidad-relación y transformación al modelo lógico.
2. `sql/sql-server`: DDL, DML, consultas, permisos, índices y procedimientos en T-SQL.
3. `sql/postgresql`: laboratorio inicial propio; debe ejecutarse y documentarse antes de ampliar el bloque.
4. `sql/oracle`: prácticas específicas de Oracle Database, después de ser recibidas y validadas.
5. `nosql/mongodb`: laboratorio documental inicial; debe ejecutarse y documentarse antes de ampliar el bloque.
6. `nosql/cassandra`: modelado orientado a consultas y CQL, después de ser recibido y validado.
7. Comparación: justificar cuándo conviene un modelo relacional, documental o de columnas anchas.

## SQL y NoSQL

| Familia | Tecnología | Enfoque esperado | Estado |
|---|---|---|---|
| SQL | SQL Server | T-SQL, restricciones, consultas, seguridad e índices | Validado localmente; en evaluación editorial |
| SQL | PostgreSQL | Esquema, integridad, consultas, vista, índice y transacción | En desarrollo; ejecución local pendiente |
| SQL | Oracle Database | SQL, secuencias, PL/SQL y objetos del esquema | Pendiente de contenido |
| NoSQL documental | MongoDB | documentos, CRUD, índice y agregación | En desarrollo; ejecución local pendiente |
| NoSQL de columnas anchas | Apache Cassandra | particiones, clustering y CQL | Pendiente de contenido |

SQL Server, PostgreSQL y Oracle comparten fundamentos relacionales, pero no todos sus comandos son intercambiables. MongoDB y Cassandra pertenecen a la familia no relacional, pero tampoco deben agruparse como si utilizaran el mismo modelo: MongoDB es documental y Cassandra utiliza columnas anchas con modelado orientado a consultas.

La clasificación `sql` y `nosql` organiza familias de bases de datos, no lenguajes de programación. SQL Server, PostgreSQL y Oracle son relacionales. MongoDB es documental y Cassandra utiliza columnas anchas con modelado orientado a consultas.

SQL es además el lenguaje común de los motores relacionales, pero cada motor tiene su propio dialecto y herramientas. T-SQL, PL/SQL, CQL y el lenguaje de consultas de MongoDB deben estudiarse dentro del motor al que pertenecen.

## Material actual

- `glosario.md`: conceptos compartidos y diferencias esenciales.
- `ejercicios-comunidad.md`: retos propios posteriores a los ejemplos resueltos.
- `modelado`: diagramas y modelos lógico-relacionales.
- `sql/sql-server/README.md`: contexto, orden de ejecución y evidencia de validación.
- `sql/sql-server/ddl-dml-queries`: secuencia ejecutable de prácticas T-SQL.
- `sql/postgresql/01-inventario-academico.sql`: primer laboratorio didáctico propio de PostgreSQL.
- `nosql/mongodb/01-inventario-documental.mongodb.js`: primer laboratorio didáctico propio de MongoDB.
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
