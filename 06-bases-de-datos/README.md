# 06 · Bases de datos

Esta etapa enseña a **modelar, implementar, consultar, proteger y elegir bases de datos con criterio**. El protagonista es el concepto; SQL Server, PostgreSQL, Oracle, MongoDB y Cassandra muestran cómo cambia la implementación según el motor y el modelo de datos.

## Antes de empezar

Conviene dominar programación básica, estructuras de datos elementales y lectura de diagramas. Trabaja siempre con **datos ficticios** y una base exclusiva de práctica.

## Cómo recorrer la etapa

1. Empieza por fundamentos, modelado y normalización.
2. Continúa con SQL relacional: DDL, DML, consultas, transacciones, índices y seguridad.
3. Compara dialectos entre SQL Server, PostgreSQL y Oracle sin memorizar comandos aislados.
4. Estudia MongoDB y Cassandra como modelos distintos, no como sustitutos directos de SQL.
5. Cierra justificando qué modelo y motor conviene para un problema concreto.

Consulta [`ruta-de-aprendizaje.md`](ruta-de-aprendizaje.md) para ver la progresión completa.
Revisa [`estado-publicacion.md`](estado-publicacion.md) antes de considerar disponible una práctica en un motor concreto.

## Estructura de cada tema

En los bloques relacionales encontrarás, cuando corresponde:

```text
tema/
├── README.md
├── sql-server/
│   ├── ejemplos/
│   ├── practicas/
│   └── soluciones/
├── postgresql/
│   ├── ejemplos/
│   ├── practicas/
│   └── soluciones/
└── oracle/
    ├── ejemplos/
    ├── practicas/
    └── soluciones/
```

- **ejemplos/**: código pequeño para observar un concepto.
- **practicas/**: ejercicios completos, incluidas prácticas académicas reorganizadas.
- **soluciones/**: una referencia para comparar después de intentar el reto del tema.

Los comentarios siguen un criterio simple y técnico:

```sql
-- La clave foránea evita registrar una categoría inexistente.
-- COMMIT confirma de forma permanente los cambios de la transacción.
-- El índice compuesto sigue el orden de las columnas definidas.
```

## Motores de la ruta

| Tecnología | Modelo | Papel en la ruta |
|---|---|---|
| SQL Server | Relacional | T-SQL, administración y objetos programables |
| PostgreSQL | Relacional | SQL estándar, extensibilidad y análisis de consultas |
| Oracle Database | Relacional | SQL/PLSQL, secuencias y objetos de esquema |
| MongoDB | Documental | Documentos, índices y pipelines de agregación |
| Apache Cassandra | Columnas anchas | Particiones, clustering y modelado orientado a consultas |

## Criterio de avance

No basta con ejecutar scripts. Al finalizar debes poder explicar:

- por qué el modelo representa correctamente el problema;
- qué restricciones protegen los datos;
- por qué una consulta produce determinado resultado;
- cuándo una transacción, un índice o un permiso son necesarios;
- por qué un caso conviene en un modelo relacional, documental o de columnas anchas.

> La ruta prepara el terreno para backend y persistencia desde aplicaciones, pero aquí el foco sigue siendo la base de datos.

Contenido creado para Chilete DevPath con apoyo de IA para estructuración y revisión. El criterio, selección y validación final corresponden a Adrian Pisco, autor de Chilete DevPath.
