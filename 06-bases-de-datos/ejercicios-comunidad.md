# Retos de bases de datos

Estos retos se realizan después de estudiar prácticas validadas del motor elegido.

## Reto 1: modelado relacional

Modela una ruta de aprendizaje con temas, recursos, prerrequisitos y avances.

- identifica entidades y cardinalidades;
- resuelve las relaciones muchos a muchos;
- justifica claves y restricciones;
- señala qué datos no deberían duplicarse.

## Reto 2: SQL con dialecto declarado

Implementa el modelo en SQL Server, PostgreSQL u Oracle Database.

- declara motor y versión;
- crea datos ficticios;
- incluye consultas con filtros, uniones y agregaciones;
- registra qué sintaxis no sería portable a los otros motores.

## Reto 3: transacción y permisos

Simula una actualización que modifique dos tablas relacionadas.

- demuestra confirmación y reversión;
- crea un usuario de lectura con privilegio mínimo;
- elimina el usuario al terminar;
- ejecuta todo en una base de práctica.

## Reto 4: MongoDB

Después de ejecutar `nosql/mongodb/01-inventario-documental.mongodb.js`, diseña una colección diferente que incluya consultas, agregación, índices y una decisión argumentada sobre datos embebidos o referenciados. No copies el inventario de referencia.

## Reto 5: Cassandra

Este reto se habilitará cuando exista una práctica Cassandra recibida y validada. Deberá partir de consultas conocidas, definir claves de partición y clustering, y explicar por qué no se modela como una base relacional.

## Evidencia mínima

Cada solución debe indicar propósito, motor, versión, contexto de ejecución, datos editables, comandos destructivos, resultado esperado, resultado obtenido y fuentes.
