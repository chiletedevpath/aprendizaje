# 04 · Estructuras de datos

Esta etapa estudia **cómo organizar datos en memoria y cómo elegir una estructura según las operaciones que el problema necesita**.

No se trata de memorizar nombres como `ArrayList`, `HashMap` o `TreeNode`. La meta es poder explicar qué estructura conviene, qué operación ofrece y cuál es su costo aproximado.

## Antes de empezar

Conviene haber completado:

- `00-fundamentos`;
- `01-pseudocodigo`;
- `02-programacion-basica`;
- `03-poo`.

Debes sentirte cómodo con clases, objetos, referencias, genéricos, colecciones básicas y excepciones.

## Cómo estudiar esta etapa

Cada tema mantiene la misma lógica:

```text
README.md        → idea, operaciones y criterio de avance
java/ejemplos/   → uso pequeño de la estructura
java/implementaciones/ → construcción educativa cuando aporta valor
java/practicas/  → problemas completos ya desarrollados
java/soluciones/ → solución del reto del tema

scala/           → misma lógica usando Scala
```

`implementaciones/` solo aparece cuando construir la estructura ayuda a comprenderla. No tiene sentido reimplementar todo lo que ya ofrece la biblioteca estándar.

## Ruta

| Etapa | Tema | Nivel |
|---:|---|---|
| 01 | [Fundamentos y complejidad](01-fundamentos-y-complejidad/) | Básico |
| 02 | [Arreglos y listas dinámicas](02-arreglos-y-listas-dinamicas/) | Básico |
| 03 | [Listas enlazadas](03-listas-enlazadas/) | Básico |
| 04 | [Pilas](04-pilas/) | Básico |
| 05 | [Colas y deques](05-colas-y-deques/) | Básico |
| 06 | [Conjuntos y mapas](06-conjuntos-y-mapas/) | Básico avanzado |
| 07 | [Tablas hash](07-tablas-hash/) | Básico avanzado |
| 08 | [Árboles binarios](08-arboles-binarios/) | Básico avanzado |
| 09 | [Árboles binarios de búsqueda](09-arboles-binarios-busqueda/) | Intermedio |
| 10 | [Heaps y colas de prioridad](10-heaps-y-colas-prioridad/) | Intermedio |
| 11 | [Grafos: representación](11-grafos-representacion/) | Intermedio |
| 12 | [Índices y organización de registros](12-indices-y-organizacion-registros/) | Intermedio |
| 13 | [Selección y combinación de estructuras](13-seleccion-y-combinacion-estructuras/) | Intermedio |
| 14 | [Integración](14-integracion/) | Intermedio |


## Diferencia con `05-algoritmos`

- **Estructuras de datos:** decide cómo representar y almacenar información.
- **Algoritmos:** estudia los pasos para procesarla, buscarla, ordenarla, recorrer grafos o resolver problemas con eficiencia.

Ejemplo: aquí se aprende a representar un grafo mediante una lista de adyacencia. En `05-algoritmos` se estudiarán BFS, DFS, Dijkstra y otras estrategias.

## Lenguajes

La ruta utiliza **Java y Scala** para comparar cómo se expresan los mismos conceptos. Java conserva además las prácticas académicas que ya existían en el repositorio.

## Criterio de salida

Al finalizar deberías poder justificar decisiones como:

- “uso una cola porque debo respetar el orden de llegada”;
- “uso un mapa porque necesito localizar un objeto por clave”;
- “uso una cola de prioridad porque el orden depende de una prioridad, no de la llegada”;
- “uso una lista de adyacencia porque el grafo es disperso”;
- “combino `List`, `Map` y `Set` porque cada una resuelve una operación diferente”.

Siguiente etapa: **05 · Algoritmos**.

## Criterio de autoría

Contenido creado para Chilete DevPath con apoyo de IA para estructuración y revisión. El criterio, selección y validación final corresponden a Adrian Pisco, autor de Chilete DevPath.
