# Estado de evaluación y publicación

Esta matriz diferencia el contenido organizado de las prácticas que cuentan con ejecución comprobada. Una revisión estática no sustituye la validación sobre el motor correspondiente.

| Bloque | Contenido disponible | Validación comprobada | Estado |
|---|---|---|---|
| Fundamentos y selección tecnológica | Conceptos, criterios y casos comparativos | Revisión didáctica y editorial | Disponible |
| Modelado | Tres diagramas ER y modelos lógico-relacionales | Falta revisar visualmente todos los diagramas contra sus enunciados originales | En evaluación |
| SQL Server | DDL, DML, consultas, transacciones, seguridad, índices y objetos programables | La secuencia histórica se ejecutó dos veces el 28/08/2026 sobre SQL Server `16.0.1190.2` | Disponible con revisión editorial pendiente |
| PostgreSQL | DDL, DML, consultas, transacciones, índices, vistas, seguridad y objetos programables | La secuencia histórica se ejecutó dos veces el 28/08/2026 sobre PostgreSQL `18.1` | Disponible con revisión editorial pendiente |
| Oracle Database | Ejemplos, prácticas y soluciones introductorias en SQL y PL/SQL | Los tres recorridos se ejecutaron el 29/08/2026 sobre Oracle XE `21.3`; finalizaron sin errores ni objetos inválidos | Disponible con revisión editorial pendiente |
| MongoDB | Documentos, CRUD, índices y agregaciones | Los cuatro scripts se ejecutaron el 29/08/2026 sobre MongoDB `7.0.34`; se comprobaron documentos, categorías e índices | Disponible con revisión editorial pendiente |
| Apache Cassandra | Keyspace, CQL, particiones y clustering | Los tres scripts se ejecutaron el 29/08/2026 sobre Cassandra `5.0.9`; se comprobaron partición, orden descendente y dos avances | Disponible con revisión editorial pendiente |

## Condiciones para aprobar un bloque

1. Propósito y prerrequisitos explícitos.
2. Datos exclusivamente ficticios.
3. Comandos identificados por motor y contexto de ejecución.
4. Casos normales, límites y errores esperados.
5. Instrucciones destructivas aisladas y advertidas.
6. Ejecución reproducible en una versión documentada del motor.
7. Fuentes y autoría revisadas.
8. Ejemplo, práctica, reto y evidencia de integración cuando correspondan.

Hasta cumplir estas condiciones, el bloque debe presentarse como contenido en evaluación y no como práctica validada de Chilete DevPath.

## Evidencia académica relacionada

Los proyectos formales conservados en `academia` demuestran experiencia aplicada, pero no se copian como guías. En `aprendizaje` se mantienen ejercicios pequeños, genéricos y explicables.
