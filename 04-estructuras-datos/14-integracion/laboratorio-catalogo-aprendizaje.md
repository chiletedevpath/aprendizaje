# Laboratorio integrador · Catálogo de aprendizaje

## Propósito

Diseñar un sistema en memoria que combine estructuras según las operaciones requeridas, sin convertirlo todavía en una base de datos, API o proyecto académico.

## Situación

Chilete DevPath necesita administrar recursos de aprendizaje, categorías, búsquedas por código y una cola de revisión editorial.

## Requisitos funcionales

El programa debe permitir:

1. registrar recursos con código único, título, categoría y prioridad;
2. localizar un recurso por código;
3. listar los recursos en el orden en que fueron registrados;
4. mantener categorías sin duplicados;
5. procesar primero los recursos con mayor prioridad editorial;
6. eliminar un recurso y mantener consistentes todas las estructuras;
7. mostrar un resumen de cantidad por categoría.

## Restricciones de diseño

- utiliza una lista para conservar el orden principal;
- utiliza un mapa como índice por código;
- utiliza un conjunto para las categorías;
- utiliza una cola de prioridad para la revisión;
- no recorras toda la lista para una búsqueda que debe resolverse mediante el índice;
- define qué sucede cuando dos recursos tienen la misma prioridad;
- evita almacenar copias incoherentes del mismo estado;
- justifica el costo aproximado de registrar, buscar, eliminar y extraer el siguiente recurso.

## Evidencias

- implementación en Java o Scala;
- tabla breve que relacione cada requisito con la estructura elegida;
- casos de prueba normales, límite e inválidos;
- explicación de una alternativa descartada y su desventaja.

## Casos mínimos

1. catálogo vacío y primer registro;
2. código duplicado;
3. categoría repetida;
4. prioridades iguales y diferentes;
5. búsqueda existente e inexistente;
6. eliminación y posterior búsqueda del mismo código;
7. procesamiento de toda la cola hasta quedar vacía.

## Criterio de cierre

El laboratorio termina cuando compila, mantiene consistencia entre todas las estructuras y puedes explicar por qué cada operación usa una estructura concreta. La cantidad de código no es un criterio de calidad.
