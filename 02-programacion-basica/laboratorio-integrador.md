# Laboratorio integrador: seguimiento de aprendices

## Propósito

Integrar entrada de datos, condicionales, bucles, funciones, cadenas y arreglos
sin adelantar programación orientada a objetos.

## Requerimiento

Crea un programa que registre entre 1 y 10 aprendices. Por cada persona debe
solicitar:

- nombre;
- tres notas entre 0 y 20.

El programa debe normalizar espacios del nombre, calcular el promedio individual
y mostrar su estado: `Aprobado` si el promedio es al menos 11 o `Desaprobado` en
caso contrario. Al final debe presentar una tabla y el promedio general.

## Restricciones

- valida la cantidad de aprendices antes de crear los arreglos;
- no aceptes nombres vacíos;
- no aceptes notas fuera de 0 a 20;
- usa arreglos paralelos para nombres, promedios y estados;
- separa la normalización, el promedio y la clasificación en métodos;
- no uses clases de dominio, listas ni bibliotecas externas.

## Casos de prueba

1. Un aprendiz con notas `11, 11, 11`.
2. Dos aprendices, uno aprobado y otro desaprobado.
3. Cantidad `0` y cantidad `11`.
4. Nombre vacío y nombre con espacios repetidos.
5. Nota `-1`, nota `20` y nota `21`.

## Secuencia recomendada

1. Escribe entrada, proceso y salida.
2. Implementa primero el registro válido.
3. Agrega las validaciones.
4. Extrae los métodos.
5. Genera el reporte.
6. Ejecuta los cinco casos y registra el resultado.

## Implementación de referencia

Después de resolver tu versión, compárala con
`practica-integrada/java/registro-aprendices/RegistroAprendices.java`.

No busques que ambas sean idénticas: comprueba que las dos cumplen el
requerimiento, manejan los límites y pueden explicarse con claridad.
