# Algoritmos

Esta sección enseña a diseñar, comparar y verificar estrategias que procesan datos.

## Diferencia entre las secciones 04 y 05

| Sección | Pregunta principal | Ejemplos |
|---|---|---|
| `04-estructuras-datos` | ¿Cómo organizo y relaciono los datos? | listas, tablas hash, árboles e índices |
| `05-algoritmos` | ¿Qué pasos sigo para resolver el problema? | buscar, ordenar, recorrer, optimizar y retroceder |

Una estructura puede ofrecer una operación `buscar`, pero en 04 se estudia como parte de su interfaz. En 05 se analizan la estrategia, sus precondiciones, su corrección y su costo.

## Prerrequisitos

- arreglos, ciclos, métodos y clases;
- colecciones y estructuras básicas;
- pruebas con casos normales y casos límite;
- lectura de trazas de ejecución.

## Ruta sugerida

1. `fundamentos`: entrada, proceso, salida y validación mediante números primos.
2. `busqueda`: lineal sobre datos desordenados; binaria, por bloques e indexada sobre datos ordenados.
3. `ordenamiento`: Shell Sort, Merge Sort recursivo y fusión natural.
4. `recursion`: caso base, reducción del problema y retorno.
5. `backtracking`: elegir, explorar, deshacer y probar otra alternativa.
6. `grafos`: BFS, DFS, caminos mínimos y alcanzabilidad.
7. `laboratorio-integrador.md`: selección razonada de algoritmos para una ruta de aprendizaje.

## Ejercicios resueltos

Los archivos Java son ejemplos ejecutables. Cada grupo aborda una estrategia concreta:

| Tema | Resultado esperado |
|---|---|
| Búsqueda | distinguir cuándo ordenar es obligatorio y cuándo sería trabajo innecesario |
| Ordenamiento | reconocer división y mezcla, tramos naturales y saltos decrecientes |
| Recursión | identificar caso base y demostrar que cada llamada se acerca a él |
| Backtracking | observar el retroceso después de una elección que no conduce a solución |
| Grafos | diferenciar recorrido, distancia mínima y alcanzabilidad |

## Lenguajes incorporados

El modulo se organiza primero por estrategia algoritmica y despues por lenguaje. No se crean carpetas para lenguajes que aun no cuentan con implementaciones verificables.

| Tema | Java | Scala | Python |
|---|---|---|---|
| Fundamentos | Disponible | No incorporado | No incorporado |
| Busqueda | Disponible | No incorporado | No incorporado |
| Ordenamiento | Disponible | No incorporado | No incorporado |
| Recursion | Disponible | No incorporado | No incorporado |
| Backtracking | Disponible | No incorporado | No incorporado |
| Grafos | Disponible | No incorporado | No incorporado |

Cuando exista evidencia en Scala o Python, debe incorporarse dentro del algoritmo correspondiente. Por ejemplo, una implementacion comprobada de busqueda binaria en Python vivira en `busqueda/python`; no se creara una carpeta paralela en la raiz.

## Retos

`ejercicios-comunidad.md` contiene problemas sin una única implementación obligatoria. Deben resolverse después de ejecutar y explicar los ejemplos.

## Criterio de logro

Puedes avanzar cuando logres:

- declarar las precondiciones de cada algoritmo;
- justificar la estrategia antes de programarla;
- demostrar el resultado con casos normales, vacíos, ausentes y no alcanzables;
- explicar una diferencia de costo sin limitarte a decir cuál “es más rápido”;
- distinguir claramente una estructura de datos del algoritmo que opera sobre ella.

## Autoría y fuentes

El contenido corresponde a ejercicios desarrollados por Adrian Pisco durante su proceso de aprendizaje. Toda adaptación futura debe registrar su fuente antes de publicarse.
