# Retos de estructuras de datos

Cada bloque parte de una estructura resuelta y propone un reto equivalente. El
objetivo es justificar cómo organizar los datos, no diseñar todavía algoritmos
de búsqueda u ordenamiento.

## 1. Colecciones lineales

Referencias:

- `colecciones-lineales/java/array-list`
- `colecciones-lineales/java/listas-de-objetos`

Reto: registra recursos de aprendizaje conservando el orden de ingreso. Permite
agregar al final, retirar el primero y mostrar los elementos restantes.

Casos: lista vacía, un elemento, varios elementos y retiro hasta vaciarla.

## 2. Tablas hash

Referencias:

- `tablas-hash/java/tabla-dispersion`
- `tablas-hash/java/doble-hashing`

Reto: almacena códigos ficticios en una tabla y define una política explícita
para colisiones y duplicados.

Casos: clave positiva, clave negativa, duplicada, colisión, búsqueda ausente y
tabla llena.

## 3. Árboles binarios

Referencia: `arboles-binarios/java/arbol-binario-tickets`.

Reto: representa una jerarquía de categorías con una raíz y hasta dos hijos por
nodo. Muestra la estructura respetando niveles.

Casos: árbol vacío, solo raíz, una rama y dos ramas.

El recorrido sirve aquí para observar los enlaces del árbol. Comparar BFS, DFS,
caminos mínimos o alcanzabilidad pertenece a `05-algoritmos/grafos`.

## 4. Índices y registros simulados

Referencia: `indices-y-archivos-simulados/java/listas-indexadas`.

Reto: relaciona clave, registro y ubicación mediante índices auxiliares.
Actualiza los punteros después de insertar o eliminar.

Casos: clave existente, duplicada, ausente y eliminación que obligue a
recalcular posiciones.

## 5. Cierre integrado

Resuelve `laboratorio-integrador.md`. La implementación de referencia está en
`practicas-integradoras/java/catalogo-indexado`.

## Criterios de logro

- la estructura elegida responde al tipo de relación entre los datos;
- tamaños, índices, claves y referencias inválidas se controlan;
- la política de duplicados y colisiones es explícita;
- puedes explicar el estado antes y después de cada operación;
- distingues una operación de la estructura de un algoritmo que la utiliza;
- puedes justificar por qué otra estructura sería menos adecuada.
