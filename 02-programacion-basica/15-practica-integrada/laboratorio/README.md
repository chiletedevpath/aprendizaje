# Laboratorio integrador · Seguimiento de aprendices

## Propósito

Integrar entrada, validación, condicionales, bucles, funciones, cadenas y estructuras para varios datos sin adelantar programación orientada a objetos.

## Requerimiento

Construye un programa que registre entre 1 y 10 aprendices. Por cada persona solicita:

- nombre;
- tres notas entre 0 y 20.

El programa debe normalizar el nombre, calcular el promedio, clasificar el estado (`Aprobado` desde 11) y mostrar un resumen general.

## Requisitos técnicos

- valida la cantidad de aprendices;
- no aceptes nombres vacíos;
- rechaza notas fuera de 0 a 20;
- separa normalización, promedio y clasificación en funciones/métodos;
- utiliza arreglos o colecciones de acuerdo con el punto de la ruta que quieras reforzar;
- registra al menos cinco casos de prueba;
- como ampliación intermedia, permite guardar el resumen en un archivo de texto.

## Casos mínimos

1. Un aprendiz con `11, 11, 11`.
2. Dos aprendices: uno aprobado y otro desaprobado.
3. Cantidad `0` y `11`.
4. Nombre vacío o con espacios repetidos.
5. Nota `-1`, `20` y `21`.

## Criterio de calidad

La solución no se evalúa por cantidad de líneas sino por claridad: datos bien representados, funciones pequeñas, validaciones explícitas y resultados comprobables.
