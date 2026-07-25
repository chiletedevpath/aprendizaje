# Laboratorio integrador: seguimiento de aprendizaje

## Propósito

Construir un modelo pequeño que combine encapsulamiento, composición,
abstracción, interfaces y polimorfismo antes de avanzar a estructuras de datos.

## Requerimiento

Una ruta contiene un nombre y varias actividades. Toda actividad tiene título y
puntaje máximo, pero cada tipo calcula su puntaje de manera diferente:

- una lectura usa el porcentaje de comprensión;
- un ejercicio práctico usa pruebas superadas y pruebas totales.

La ruta debe mostrar cada resultado y calcular el porcentaje global obtenido.

## Reglas

- títulos y nombre de ruta no pueden estar vacíos;
- el puntaje máximo debe ser positivo;
- comprensión debe estar entre 0 y 100;
- pruebas superadas no puede exceder pruebas totales;
- usa una clase abstracta para el estado común;
- usa una interfaz para el comportamiento evaluable;
- procesa todas las actividades mediante el tipo común;
- no uses `instanceof` ni condicionales para escoger la fórmula.

## Casos de prueba

1. Lectura con comprensión `80`.
2. Ejercicio con `8` de `10` pruebas superadas.
3. Comprensión `-1` y `101`.
4. Cero pruebas totales.
5. Más pruebas superadas que pruebas totales.
6. Ruta con actividades de ambos tipos.

## Secuencia

1. Dibuja las clases y relaciones.
2. Implementa la interfaz y la clase abstracta.
3. Implementa las dos especializaciones.
4. Compón la ruta con actividades.
5. Ejecuta los casos y explica dónde se protege cada regla.

## Referencia

Compara tu primera versión con
`mini-proyectos/java/seguimiento-aprendizaje`. No busques que el código sea
idéntico: verifica responsabilidades, estados válidos y sustitución polimórfica.
