# Laboratorio integrador · Seguimiento de aprendices

## Propósito

Construir una aplicación de consola que integre los contenidos de programación básica sin utilizar todavía programación orientada a objetos.

## Situación

Chilete DevPath necesita registrar el avance de un grupo de aprendices. El programa debe permitir ingresar estudiantes, calcular resultados y consultar un resumen antes de finalizar.

## Requisitos funcionales

El programa debe presentar un menú que permita:

1. registrar un aprendiz con nombre y tres notas;
2. listar los aprendices registrados con su promedio y estado;
3. buscar un aprendiz por nombre;
4. mostrar el promedio general y las notas mayor y menor;
5. guardar el reporte en un archivo de texto;
6. salir de forma controlada.

Un aprendiz aprueba con promedio mayor o igual a 11. Las notas válidas están entre 0 y 20.

## Requisitos técnicos

- implementa una versión en Java o Scala;
- usa funciones o métodos pequeños y con una sola responsabilidad;
- emplea arreglos o colecciones sin crear clases del dominio;
- normaliza los nombres y rechaza valores vacíos;
- controla entradas no numéricas y opciones inexistentes;
- evita dividir entre cero cuando aún no existen registros;
- utiliza UTF-8 al guardar el reporte;
- no copies la solución de otro reto como entrega final.

## Casos mínimos de comprobación

Documenta el resultado esperado y obtenido de estos casos:

1. primer registro válido;
2. nota `0`, nota `20` y promedio exactamente `11`;
3. nota `-1`, nota `21` y texto donde se espera un número;
4. nombre vacío, con espacios repetidos y búsqueda sin coincidencias;
5. resumen sin estudiantes y con varios estudiantes;
6. archivo creado con los mismos datos mostrados en consola.

## Criterios de cierre

El laboratorio está terminado cuando compila, permite recorrer todas las opciones, supera los casos mínimos y puedes explicar por qué elegiste cada estructura. Conserva tu solución dentro de una carpeta `entrega/` solamente cuando esté comprobada.
