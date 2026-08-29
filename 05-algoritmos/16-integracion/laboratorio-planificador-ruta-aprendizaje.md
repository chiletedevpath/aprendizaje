# Laboratorio integrador: planificador de una ruta de aprendizaje

## Propósito

Elegir algoritmos según el problema, sin confundirlos con las estructuras que almacenan los datos.

## Escenario

Una ruta contiene temas con código, nombre, duración y prerrequisitos. Debes localizar temas, ordenarlos para una vista de estudio y calcular qué temas son alcanzables desde un punto inicial.

## Preparación

Antes de empezar, revisa:

- `03-busqueda-lineal-y-binaria`;
- `05-ordenamientos-eficientes`;
- `11-recorridos-en-grafos`;
- `12-caminos-y-alcanzabilidad`.

## Desarrollo

1. Crea al menos ocho temas; incluye códigos desordenados, duraciones repetidas y un tema aislado.
2. Localiza un código sobre la colección original mediante búsqueda lineal.
3. Ordena una copia por código y aplica búsqueda binaria. Declara expresamente esta precondición.
4. Ordena otra copia por duración y nombre para presentar la ruta.
5. Representa los prerrequisitos como grafo dirigido y recórrelo con BFS y DFS.
6. Calcula la matriz de alcanzabilidad y detecta el tema aislado.
7. Prueba código existente, código ausente, colección vacía y origen inexistente.

## Decisiones que debes defender

- ¿Por qué la búsqueda lineal no necesita ordenar?
- ¿Por qué una copia ordenada por duración no sirve directamente para buscar por código?
- ¿Qué cambia entre BFS, DFS y Warshall aunque operen sobre el mismo grafo?
- ¿Qué parte pertenece a la estructura de datos y qué parte pertenece al algoritmo?

## Evidencia esperada

Entrega:

- código ejecutable;
- tabla de casos con resultados esperados y obtenidos;
- salidas relevantes;
- explicación de las precondiciones;
- conclusión que compare las estrategias y sus costos aproximados.

El laboratorio está logrado cuando las precondiciones se respetan y los casos límite producen resultados controlados.
