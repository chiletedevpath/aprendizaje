# Ruta de aprendizaje — Bases de datos

La etapa avanza de **modelar datos** a **operarlos y elegir una tecnología con criterio**.

| # | Nivel | Tema | Resultado esperado |
|---:|---|---|---|
| 01 | Básico | [Fundamentos y SGBD](01-fundamentos-y-sgbd/README.md) | Comprender qué problema resuelve una base de datos y diferenciar modelo, SGBD, esquema e instancia. |
| 02 | Básico | [Modelado entidad-relación](02-modelado-entidad-relacion/README.md) | Representar entidades, atributos, relaciones, cardinalidades y restricciones antes de elegir un motor. |
| 03 | Básico | [Modelo relacional y normalización](03-modelo-relacional-y-normalizacion/README.md) | Transformar un modelo conceptual en tablas coherentes y reducir redundancia mediante normalización. |
| 04 | Básico | [DDL, esquemas y restricciones](04-ddl-esquemas-y-restricciones/README.md) | Definir estructuras persistentes y proteger la integridad desde el esquema. |
| 05 | Básico | [DML y CRUD](05-dml-crud/README.md) | Insertar, actualizar y eliminar datos de forma controlada. |
| 06 | Básico | [Consultas y filtrado](06-consultas-y-filtrado/README.md) | Recuperar datos con filtros, orden, condiciones y funciones sin depender de SELECT *. |
| 07 | Básico avanzado | [Joins, agrupaciones y consultas avanzadas](07-joins-agrupaciones-y-consultas-avanzadas/README.md) | Relacionar tablas y construir consultas de análisis con agregaciones, CTE, conjuntos y ventanas. |
| 08 | Intermedio | [Transacciones y concurrencia](08-transacciones-y-concurrencia/README.md) | Mantener consistencia ante operaciones múltiples y comprender los principales problemas de concurrencia. |
| 09 | Intermedio | [Índices y optimización](09-indices-y-optimizacion/README.md) | Acelerar consultas con criterio y observar el costo de lectura, escritura y almacenamiento. |
| 10 | Intermedio | [Vistas, funciones, procedimientos y triggers](10-vistas-funciones-procedimientos-y-triggers/README.md) | Encapsular consultas y lógica cercana a los datos reconociendo diferencias entre motores. |
| 11 | Intermedio | [Seguridad, roles y permisos](11-seguridad-roles-y-permisos/README.md) | Aplicar mínimo privilegio y separar responsabilidades de administración y aplicación. |
| 12 | Intermedio | [Respaldo, importación y migración](12-respaldo-importacion-y-migracion/README.md) | Comprender operaciones básicas para proteger, trasladar y recuperar información. |
| 13 | Intermedio | [NoSQL documental con MongoDB](13-nosql-documental-mongodb/README.md) | Modelar documentos desde los patrones de acceso y trabajar CRUD, índices y agregaciones. |
| 14 | Intermedio | [NoSQL de columnas anchas con Cassandra](14-nosql-columnas-anchas-cassandra/README.md) | Diseñar tablas desde las consultas mediante particiones, clustering y CQL. |
| 15 | Intermedio | [Selección de modelo y motor](15-seleccion-de-modelo-y-motor/README.md) | Elegir una tecnología por requisitos de consistencia, relaciones, volumen, distribución y patrones de acceso. |
| 16 | Integración | [Integración](16-integracion/README.md) | Modelar e implementar una solución de datos de extremo a extremo y justificar las decisiones tomadas. |

## Progresión

```text
Fundamentos
   ↓
Modelado ER
   ↓
Modelo relacional + normalización
   ↓
SQL: estructura → datos → consultas
   ↓
Transacciones → índices → objetos → seguridad
   ↓
Operación: respaldo y migración
   ↓
MongoDB / Cassandra
   ↓
Selección tecnológica
   ↓
Integración
```

El orden es intencional: primero se entiende el problema y el modelo; después se elige y utiliza una tecnología.