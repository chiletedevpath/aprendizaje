# Estructuras de datos

Esta seccion estudia cómo representar, almacenar y relacionar datos en memoria.
Las operaciones de insertar, consultar, recorrer y eliminar se usan para
comprobar el comportamiento de cada estructura.

## Objetivo

Comprender como elegir y aplicar estructuras de datos segun el problema: colecciones lineales para secuencias, tablas hash para busquedas por clave, arboles para jerarquias e indices auxiliares para organizar registros.

## Diferencia con `05-algoritmos`

| `04-estructuras-datos` | `05-algoritmos` |
|---|---|
| Decide cómo se organizan los datos. | Decide qué pasos resuelven el problema. |
| Estudia listas, tablas hash, árboles e índices. | Estudia búsqueda, ordenamiento, recursión, backtracking y algoritmos de grafos. |
| Pregunta: “¿Dónde y cómo guardo cada dato?”. | Pregunta: “¿Cómo proceso los datos y por qué funciona?”. |
| Usa operaciones básicas para observar la estructura. | Compara estrategias, precondiciones y eficiencia. |

Una tabla hash puede ofrecer `buscar()` en esta sección porque consultar es una
operación propia de la estructura. Comparar búsqueda lineal, binaria o indexada,
demostrar sus pasos y analizar sus requisitos corresponde a la sección 5.

## Publico objetivo

Este modulo esta dirigido a:

- estudiantes que ya entienden programacion basica y POO;
- personas que necesitan practicar colecciones antes de algoritmos;
- miembros de la comunidad Chilete DevPath que quieren aprender a elegir estructuras segun el problema;
- estudiantes que buscan conectar teoria, implementacion y analisis de resultados.

## Prerrequisitos recomendados

Antes de iniciar este modulo, conviene poder:

- crear clases y objetos simples;
- recorrer arreglos y listas con bucles;
- entender indices, posiciones y referencias;
- leer metodos que insertan, buscan o eliminan datos;
- explicar que entrada recibe un programa y que salida produce.

## Material de apoyo

- `glosario.md`: terminos esenciales de estructuras de datos.
- `ejercicios-comunidad.md`: retos propuestos para practicar seleccion e implementacion.
- `laboratorio-integrador.md`: práctica final para combinar una secuencia y un índice por clave.

## Ruta sugerida

1. Revisar `colecciones-lineales` para comparar operaciones con `ArrayList` y `LinkedList`.
2. Estudiar `tablas-hash` para practicar dispersion, colisiones y busqueda.
3. Continuar con `arboles-binarios` para representar jerarquias mediante nodos.
4. Avanzar a `indices-y-archivos-simulados` para relacionar claves, registros y ubicaciones.
5. Resolver `laboratorio-integrador.md` justificando cada estructura elegida.

## Contenido actual

| Carpeta | Enfoque |
|---|---|
| `colecciones-lineales` | Uso de `ArrayList`, `LinkedList`, operaciones indexadas y colecciones de objetos. |
| `tablas-hash` | Insercion, busqueda, eliminacion, dispersion, colisiones y doble hashing. |
| `arboles-binarios` | Nodos, raiz, relaciones izquierda/derecha y arbol aplicado a tickets. |
| `indices-y-archivos-simulados` | Estructuras auxiliares de claves, clientes y ubicaciones sin persistencia real. |

## Criterio de avance

Este modulo se considera logrado cuando puedes:

- elegir entre coleccion lineal, tabla hash, arbol o indice auxiliar segun el problema;
- explicar el costo practico de insertar, buscar o eliminar datos;
- representar datos relacionados sin forzar una estructura incorrecta;
- interpretar una colision en una tabla hash;
- reconocer raiz, nodos y ramas de un arbol binario;
- explicar como un indice auxiliar permite localizar registros;
- probar una estructura con casos normales y casos limite.

## Criterio Chilete DevPath

Los ejemplos se mantienen como practicas educativas. No representan sistemas productivos ni proyectos academicos finales.

Para publicarlos en una futura web, cada ejercicio elegido debe tener enunciado propio, explicacion breve, solucion desarrollada y datos ficticios. Si se agregan diagramas de grafos o tablas, deben ser propios o contar con referencia clara.

## Autoria y fuentes

El contenido corresponde a ejercicios desarrollados por Adrian Pisco durante su proceso de aprendizaje. Si algun ejercicio futuro se adapta desde una fuente externa, debe indicarse la referencia correspondiente antes de publicarlo.
