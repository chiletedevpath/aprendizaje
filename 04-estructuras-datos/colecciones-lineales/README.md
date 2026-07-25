# Colecciones lineales con Java

Este bloque introduce listas mediante las implementaciones de la biblioteca de Java. No implementa desde cero una lista enlazada; ese ejercicio corresponde a un nivel posterior de estructuras de datos.

## Contenido

- `java/array-list/EjecutarOperacionesListas.java`: operaciones por indice y por valor con `List<String>` y `ArrayList`.
- `java/listas-de-objetos/EjemploArrayList.java`: almacenamiento y acceso por indice a objetos `FiguraGeometrica`.
- `java/listas-de-objetos/EjemploLinkedList.java`: insercion y eliminacion en los extremos de una `LinkedList`.
- `java/listas-de-objetos/FiguraGeometrica.java`: modelo compartido por los dos ejemplos de listas de objetos.

`EjercicioConListas.java` fue retirado porque repetia las operaciones de `EjecutarOperacionesListas.java` con otros textos y, aunque estaba ubicado en `listas-de-objetos`, solo almacenaba cadenas.

## Diferencias esenciales

| Operacion | `ArrayList` | `LinkedList` |
| --- | --- | --- |
| Acceso por indice | O(1) | O(n) |
| Agregar al final | O(1) amortizado | O(1) |
| Insertar o eliminar al inicio | O(n) | O(1) |
| Memoria adicional | Menor | Mayor por los enlaces entre nodos |

Estas complejidades describen el comportamiento habitual de las implementaciones. Buscar un valor sigue siendo O(n) en ambas.

En esta sección la complejidad se usa solo como característica para elegir una
estructura. La demostración, comparación y diseño de algoritmos de búsqueda u
ordenamiento corresponde a `05-algoritmos`.

## Validacion manual

Compilar cada grupo por separado evita conflictos entre ejemplos sin paquetes:

```powershell
javac -Xlint:all -d out java/array-list/EjecutarOperacionesListas.java
java -cp out EjecutarOperacionesListas

javac -Xlint:all -d out java/listas-de-objetos/*.java
java -cp out EjemploArrayList
java -cp out EjemploLinkedList
```

Al probar indices, un valor negativo o un valor igual o mayor que `size()` produce `IndexOutOfBoundsException`. Al retirar un elemento de una lista vacia mediante `removeFirst()` o `removeLast()`, se produce `NoSuchElementException`; `pollFirst()` y `pollLast()` devuelven `null` en ese caso.
