# 08 · Patrones de diseño

Este módulo desarrolla criterio de diseño orientado a objetos: primero identifica problemas de diseño, después aplica principios y patrones solo cuando reducen complejidad real.

## Objetivo

Al terminar podrás:

- reconocer acoplamiento, baja cohesión y responsabilidades mezcladas;
- aplicar los cinco principios SOLID con una justificación concreta;
- diferenciar y aplicar los 23 patrones GoF clásicos;
- comparar patrones que suelen confundirse;
- refactorizar sin introducir abstracciones innecesarias;
- combinar patrones cuando el problema realmente lo requiere.

## Prerrequisitos

Se recomienda dominar `03-poo`, además de poder leer colecciones, excepciones y código Java organizado en varias clases.

## Ruta

| Etapa | Enfoque |
|---|---|
| 01 | Fundamentos de diseño y code smells |
| 02 | SOLID, composición e inyección de dependencias |
| 03 | Patrones creacionales |
| 04 | Patrones estructurales |
| 05 | Patrones de comportamiento |
| 06 | Comparación y combinación |
| 07 | Refactorización, selección y antipatrones |
| 08 | Integración y justificación de decisiones |

## Cómo usar el código

Dentro de cada patrón se mantienen tres tipos de material:

- `ejemplos/`: muestran la idea esencial con el menor código razonable;
- `practicas/`: aplican el patrón a un caso más completo e incluyen prácticas previas cuando existen;
- `soluciones/`: permiten comparar una respuesta con el reto indicado en el README del bloque.

Los comentarios del código explican decisiones técnicas relevantes y evitan describir instrucciones obvias.

## Lenguaje

Java es el lenguaje principal de este módulo. Scala se utilizará posteriormente en comparaciones puntuales cuando sus características cambien la forma de expresar un patrón.

## Límite del módulo

Spring Boot, MVC, Repository, Service Layer, DTO, Clean Architecture y patrones propios de aplicaciones backend no se desarrollan aquí. Se estudian con contexto en `09-backend`.

## Siguiente etapa

`09-backend`: aplicar principios, dependencias y patrones dentro de aplicaciones del lado del servidor.
