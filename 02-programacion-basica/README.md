# 02 · Programación básica

Esta etapa convierte la lógica trabajada en pseudocódigo en programas reales. La ruta usa **Java y Scala** como lenguajes principales para mostrar que los conceptos son transferibles. Las prácticas complementarias en otro lenguaje se conservan solo cuando aplican los mismos fundamentos y se identifican por su carpeta de lenguaje.

## Cómo está organizada

Cada tema contiene un único `README.md` breve y, como base, dos implementaciones:

```text
tema/
├── README.md
├── java/
│   ├── ejemplos/
│   ├── practicas/
│   └── soluciones/
├── scala/
    ├── ejemplos/
    ├── practicas/
    └── soluciones/
└── javascript/        # solo cuando exista material estudiado
    ├── practicas/
    └── retos/
```

- **Ejemplos:** código pequeño para aprender un concepto. Los comentarios explican comportamientos técnicos importantes.
- **Prácticas:** programas completos que aplican lo aprendido. Aquí también se conservan ejercicios desarrollados durante el proceso académico.
- **Reto:** aparece al final del `README.md` de cada tema y se intenta sin mirar la respuesta.
- **Soluciones:** implementaciones de referencia del reto para comparar después de resolverlo.

No se crean carpetas vacías para completar una plantilla. Si se incorpora JavaScript, Python u otro lenguaje, sus archivos se ubican dentro del tema que enseñan y solo aparecen cuando existe contenido real.

## Cómo ejecutar el código

Puedes trabajar desde IntelliJ IDEA o desde terminal. Para un archivo Java:

```bash
javac NombreArchivo.java
java NombreClase
```

Para Scala 3, una opción simple es Scala CLI:

```bash
scala-cli NombreArchivo.scala
```

No memorices los comandos al inicio: lo importante es comprender qué archivo se compila o ejecuta y leer cualquier mensaje de error que aparezca.

## Regla de comentarios

Los comentarios deben aportar información técnica sin narrar lo obvio:

```java
// Scanner conecta el programa con la entrada estándar (teclado).
Scanner scanner = new Scanner(System.in);

// % devuelve el residuo de una división.
boolean esPar = numero % 2 == 0;
```

No se comenta cada línea. Se comenta el concepto, la decisión o el comportamiento que merece ser entendido.

## Ruta

| Nivel | Temas |
|---|---|
| Básico | 01–05 |
| Básico avanzado | 06–08 |
| Intermedio inicial | 09–10 |
| Intermedio | 11–15 |

Consulta [`ruta-de-aprendizaje.md`](ruta-de-aprendizaje.md) para ver la progresión completa.

## Antes de empezar

Se recomienda haber completado:

1. `00-fundamentos`.
2. `01-pseudocodigo`.

No es necesario conocer Java o Scala previamente.

## Criterio de avance

No avances solo porque el código ejecuta. Antes de pasar a POO debes poder:

- leer un problema y separar entrada, proceso y salida;
- elegir tipos y estructuras de control adecuadas;
- construir funciones pequeñas;
- trabajar con texto, arreglos y colecciones;
- validar entradas y reconocer errores;
- leer y escribir archivos simples;
- probar casos normales, límite e inválidos;
- explicar tu solución sin depender de copiar otra implementación.

## Alcance

Esta etapa llega hasta programación imperativa y modular de nivel intermedio. **POO comienza en `03-poo`**, por lo que aquí no se adelantan herencia, polimorfismo, interfaces ni patrones de diseño.

## Criterio de autoría

Contenido creado para Chilete DevPath con apoyo de IA para estructuración y revisión. El criterio, selección y validación final corresponden a Adrian Pisco, autor de Chilete DevPath.
