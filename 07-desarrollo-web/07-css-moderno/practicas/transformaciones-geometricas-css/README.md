# Transformaciones geométricas con CSS

Práctica con tres ejercicios independientes de transformaciones en CSS.

## Ejercicios

1. **Transformaciones 2D:** cuatro figuras con `rotate(45deg)`, `translateX(50px)`, `scale(1.5)` y `skew(10deg, 10deg)`, activadas con el cursor o el teclado.
2. **Cubo 3D:** cubo de seis caras posicionado con `translateZ()`, `rotateX()` y `rotateY()`. Rotación continua mediante `@keyframes`.
3. **Hexágono interactivo:** figura reversible que combina desplazamiento, escala y rotación en 2D con un giro en 3D. Incluye una ilustración SVG de Chilete DevPath en el centro.

## Estructura

```text
transformaciones-geometricas-css/
├── index.html
├── estilos.css
├── inicio.css
├── recursos/
│   └── chilete-devpath.svg
└── ejercicios/
    ├── 01-transformaciones-2d/
    │   ├── index.html
    │   └── estilos.css
    ├── 02-cubo-3d/
    │   ├── index.html
    │   └── estilos.css
    └── 03-hexagono-interactivo/
        ├── index.html
        └── estilos.css
```

## Ejecución

Abrir `index.html` en un navegador o utilizar **Live Server** en Visual Studio Code. No requiere instalaciones, compilación, bibliotecas ni conexión a Internet.

## Interacción

- **2D:** colocar el cursor sobre cada cuadrado o enfocarlo con Tab.
- **3D:** el cubo gira automáticamente. Al colocar el cursor o enfocarlo con Tab se pausa la animación.
- **Hexágono:** colocar el cursor sobre la figura para girarla temporalmente o hacer clic para activar o desactivar el giro. Con teclado, seleccionar con Tab y pulsar Espacio.

Las animaciones respetan la preferencia de movimiento reducido del sistema.

## Autoría

Chilete DevPath · [chiletedevpath.com](https://chiletedevpath.com/)

Los ejercicios 2D y del cubo 3D se han organizado a partir de los archivos base de clase; el hexágono es una composición independiente. El emblema SVG es una ilustración creada para esta práctica y no una copia del logotipo oficial del sitio.
