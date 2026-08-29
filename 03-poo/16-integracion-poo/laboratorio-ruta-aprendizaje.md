# Laboratorio integrador · Ruta de aprendizaje

## Propósito

Diseñar e implementar un modelo orientado a objetos que gestione una ruta de aprendizaje sin convertirlo todavía en una aplicación web, una API ni un proyecto de academia.

## Situación

Chilete DevPath necesita representar rutas, módulos, actividades y el avance de sus aprendices. El sistema debe proteger sus reglas y permitir consultar resultados sin exponer directamente el estado interno.

## Requisitos funcionales

El modelo debe permitir:

1. crear una ruta con código, nombre y nivel;
2. agregar módulos sin repetir su código;
3. registrar actividades de lectura, práctica y evaluación;
4. inscribir aprendices con datos válidos;
5. marcar actividades como completadas;
6. calcular el porcentaje de avance por aprendiz;
7. listar actividades pendientes;
8. impedir que una calificación esté fuera de 0 a 20.

## Requisitos de diseño

- identifica clases y responsabilidades antes de programar;
- usa encapsulamiento para conservar invariantes;
- modela las relaciones mediante composición o agregación justificadas;
- aplica herencia solo cuando exista una relación real de especialización;
- usa una interfaz o trait para el comportamiento evaluable;
- representa niveles o estados mediante enumeraciones;
- crea al menos una excepción propia del dominio;
- implementa igualdad y representación textual cuando tengan sentido;
- evita clases que concentren todas las responsabilidades.

## Evidencias

La entrega debe contener:

1. un diagrama UML con multiplicidades y relaciones;
2. una implementación en Java o Scala;
3. una clase o punto de entrada que demuestre el flujo principal;
4. casos de comprobación normales, límite e inválidos;
5. una explicación breve de tres decisiones de diseño.

## Casos mínimos

- ruta sin módulos y ruta con varios módulos;
- intento de agregar un código duplicado;
- aprendiz sin avances y aprendiz con todo completado;
- calificaciones `0`, `20`, `-1` y `21`;
- actividad evaluable y no evaluable;
- búsqueda de una actividad inexistente.

## Criterio de cierre

El laboratorio termina cuando compila, conserva sus reglas ante datos inválidos y puedes explicar por qué cada clase existe y cómo se relaciona con las demás. La cantidad de clases no es un criterio de calidad.
