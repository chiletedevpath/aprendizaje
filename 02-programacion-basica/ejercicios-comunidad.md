# Retos de programación básica

Esta práctica acompaña la ruta de `02-programacion-basica`. Cada bloque enlaza
un ejercicio resuelto del repositorio y propone un reto que aplica el mismo
concepto sin copiar la solución.

## Cómo trabajar

1. Ejecuta el ejercicio resuelto e identifica entrada, proceso y salida.
2. Explica por qué se eligió cada estructura.
3. Resuelve el reto en un archivo nuevo fuera del repositorio.
4. Prueba todos los casos indicados.
5. Compara tu solución con el ejercicio de referencia y anota una mejora.

## 1. Variables y tipos

Ejercicios resueltos:

- `variables/java/calculos-basicos/CalcularAreaTrapecio.java`
- `tipos-datos/java/tipos-datos-basicos/ConversionesTiposDatos.java`

Reto: registra el precio y la cantidad de un producto, calcula subtotal, IGV y
total. Rechaza valores negativos.

Casos: `precio=10, cantidad=2`; `precio=0, cantidad=5`; `precio=-2`.

## 2. Condicionales

Ejercicios resueltos:

- `condicionales/java/condicionales-basicos/EvaluarRangoSueldo.java`
- `condicionales/java/switch-y-ternario/ClasificarCalificacionSwitch.java`

Reto: recibe una nota de 0 a 20 y un porcentaje de asistencia. Determina si el
estudiante aprueba, desaprueba por nota o desaprueba por asistencia.

Casos: `15 y 90`; `9 y 90`; `18 y 60`; nota fuera de rango.

## 3. Bucles

Ejercicios resueltos:

- `bucles/java/bucles-basicos/ConvertirDecimalBinario.java`
- `bucles/java/bucles-basicos/PromediarNotasConCentinela.java`

Reto: solicita números hasta recibir cero. Muestra cantidad, suma, promedio,
mayor y menor de los valores anteriores al centinela.

Casos: `4, 8, 2, 0`; `-3, -7, 0`; `0`.

## 4. Funciones

Ejercicios resueltos:

- `funciones/java/funciones-basicas/CalculadoraDevPath.java`
- `funciones/java/funciones-basicas/ConversorTemperaturaDevPath.java`

Reto: separa en métodos el cálculo de subtotal, descuento y total de una compra.
El método de descuento debe recibir el subtotal y devolver el importe descontado.

Casos: compra sin descuento, compra en el límite y compra con descuento.

## 5. Cadenas

Ejercicios resueltos:

- `cadenas/java/cadenas-basicas/NormalizarNombreDevPath.java`
- `cadenas/java/cadenas-basicas/ValidadorCorreoDevPath.java`

Reto: normaliza el nombre de un curso y genera un código con las tres primeras
letras, sin espacios, en mayúsculas. Rechaza textos con menos de tres letras.

Casos: `"  Java básico  "`; `"Redes"`; `""`; `"BD"`.

## 6. Arreglos

Ejercicios resueltos:

- `arreglos/java/ejercicios-basicos/AnalizarNotasAlumnos.java`
- `arreglos/java/matrices/MatrizTranspuesta.java`

Reto: guarda nombres y puntajes en arreglos paralelos. Muestra el promedio,
quién obtuvo el mayor puntaje y cuántos superaron el promedio.

Casos: puntajes distintos, empate en el mayor y un solo participante.

## 7. Cierre integrado

Resuelve `laboratorio-integrador.md`. La implementación de referencia está en
`practica-integrada/java/registro-aprendices/RegistroAprendices.java`; consúltala
solo después de completar tu primera versión.

## Criterios de logro

- las entradas inválidas no producen resultados engañosos;
- cada variable y método tiene una responsabilidad comprensible;
- los casos normales, límites e inválidos fueron ejecutados;
- puedes explicar la solución sin leer el código línea por línea;
- el reto conserva los fundamentos y no adelanta POO ni colecciones.
