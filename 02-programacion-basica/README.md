# Programacion Basica

Este modulo reune ejercicios de fundamentos de programacion, principalmente en Java, y primeras practicas secuenciales en Scala.

Su proposito es practicar la transicion desde pseudocodigo hacia codigo real, aplicando variables, tipos de datos, condicionales, bucles, funciones, cadenas y arreglos.

## Objetivo

Fortalecer la base necesaria para resolver problemas pequenos con Java, escribir instrucciones claras, validar entradas simples y organizar soluciones por tema antes de avanzar a POO, estructuras de datos y proyectos mas completos.

## Publico objetivo

Este modulo esta dirigido a:

- estudiantes que ya revisaron `01-pseudocodigo`;
- personas que estan empezando a programar en Java;
- estudiantes que necesitan practicar sintaxis basica y estructuras de control;
- miembros de la comunidad Chilete DevPath que quieren reforzar fundamentos antes de pasar a temas mas avanzados.

## Prerrequisitos recomendados

Antes de iniciar este modulo, conviene poder:

- identificar entrada, proceso y salida de un problema;
- leer pseudocodigo basico;
- reconocer variables, condicionales y bucles;
- probar una solucion con casos normales y casos limite;
- explicar con palabras propias que hace un algoritmo.

## Temas

- `variables`: declaracion, asignacion y uso de variables.
- `tipos-datos`: tipos primitivos, conversiones y valores basicos.
- `condicionales`: estructuras de decision.
- `bucles`: estructuras repetitivas.
- `funciones`: metodos, parametros, retorno y descomposicion.
- `cadenas`: manipulacion de texto.
- `arreglos`: arreglos, matrices y recorridos.

## Material de apoyo

- `glosario.md`: terminos esenciales para estudiar los ejercicios.
- `ejercicios-comunidad.md`: retos graduados, casos de prueba y ejercicios resueltos de referencia.
- `laboratorio-integrador.md`: practica final que combina los temas del modulo.

## Organizacion interna

Algunas carpetas tienen subcarpetas por lenguaje o tipo de practica:

| Tema | Contenido principal |
|---|---|
| `variables` | Calculos basicos y entrada/salida en Java y Scala. |
| `tipos-datos` | Tipos primitivos, conversiones, casting y representacion de datos. |
| `condicionales` | Decisiones basicas, juegos simples, `switch` y operador ternario. |
| `bucles` | Ejercicios introductorios, bucles basicos, series numericas y validaciones. |
| `funciones` | Metodos para separar operaciones, validaciones y conversiones. |
| `cadenas` | Busqueda, normalizacion, validacion y reportes con `String`. |
| `arreglos` | Arreglos basicos, arreglos paralelos, matrices, metodos y utilidades de arrays. |
| `practica-integrada` | Ejercicios que combinan varios fundamentos en un solo flujo. |

## Ruta sugerida

1. Empieza con `variables`.
2. Continua con `tipos-datos`.
3. Practica decisiones en `condicionales`.
4. Refuerza repeticion en `bucles`.
5. Usa `funciones` para separar responsabilidades.
6. Trabaja texto en `cadenas`.
7. Cierra con `arreglos` y matrices.
8. Resuelve el `laboratorio-integrador.md` sin consultar primero la implementacion de referencia.

En cada etapa sigue este orden: revisa un ejemplo resuelto, modifica un caso,
resuelve el reto equivalente y comprueba los casos indicados en
`ejercicios-comunidad.md`.

Las practicas de Scala viven en `variables/scala/practicas-porcentajes` porque trabajan entrada, variables y operaciones secuenciales. Todavia no representan una ruta de programacion funcional.

## Lenguajes incorporados

El modulo se organiza primero por concepto y despues por lenguaje. Un lenguaje aparece solamente en los temas que ya cuentan con practicas verificables.

| Tema | Java | Scala | Python |
|---|---|---|---|
| Variables y operaciones | Disponible | Inicial | No incorporado |
| Tipos de datos | Disponible | No incorporado | No incorporado |
| Condicionales | Disponible | No incorporado | No incorporado |
| Bucles | Disponible | No incorporado | No incorporado |
| Funciones | Disponible | No incorporado | No incorporado |
| Cadenas | Disponible | No incorporado | No incorporado |
| Arreglos y colecciones basicas | Disponible | No incorporado | No incorporado |

`Inicial` significa que existe una primera evidencia ejecutable, pero todavia no una secuencia completa del lenguaje. `No incorporado` no implica desconocimiento futuro: indica que aun no existe contenido estudiado y comprobado dentro de la ruta.

Cuando se agregue un lenguaje nuevo, se incorpora dentro del tema correspondiente. Por ejemplo, una practica futura de condicionales en Python debe vivir en `condicionales/python`; no se crea una carpeta `python` en la raiz ni se generan carpetas vacias para temas pendientes.

## Criterio de marca y datos de ejemplo

Los ejercicios pueden usar nombres o mensajes personalizados cuando ayuden a dar identidad al material. Para mantener el contenido seguro y reutilizable:

- usa nombres ficticios como `Usuario Chilete`, `Aprendiz DevPath` o `Cliente Chilete`;
- usa mensajes de bienvenida como `Bienvenido a Chilete DevPath` cuando el ejercicio lo permita;
- usa correos de ejemplo con dominios reservados, como `usuario@chiletedevpath.test`;
- usa documentos, telefonos o codigos ficticios cuando el ejercicio requiera validacion;
- evita datos reales de personas, direcciones, correos, DNI o telefonos;
- evita marcas externas si no son necesarias para la logica del problema.

## Criterio de avance

Cada carpeta agrupa ejercicios pequenos orientados a reforzar un concepto concreto.

Este modulo se considera logrado cuando puedes:

- declarar variables y elegir tipos de datos adecuados;
- usar `if`, `else`, `switch`, `for`, `while` y `do while`;
- validar entradas simples;
- separar calculos en metodos basicos;
- manipular cadenas y arreglos;
- leer un ejercicio, resolverlo y explicar el razonamiento sin depender de una copia.

## Nota de autoria y fuentes

Los ejercicios corresponden a practicas desarrolladas por Adrian Pisco durante su proceso de aprendizaje. Algunos ejemplos conservan contexto academico de clase, por lo que se documentan como practica propia y evidencia de aprendizaje, no como material oficial de una institucion.

La documentacion de organizacion del modulo fue creada para Chilete DevPath con apoyo de IA para estructuracion y redaccion. La revision editorial final corresponde a Adrian Pisco, fundador de Chilete DevPath.
