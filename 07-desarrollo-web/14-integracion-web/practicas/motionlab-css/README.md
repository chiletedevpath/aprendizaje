# MotionLab CSS — Laboratorio de animaciones web

**Curso:** Hojas de Estilo en Cascada Avanzado

**Tipo:** Laboratorio integrador

**Autor:** Chilete DevPath
**Tecnologías:** HTML5, CSS3 avanzado y JavaScript (vanilla)

## 1. Objetivo

Construir una web completa, atractiva y responsiva que permita **experimentar** con cuatro animaciones vistas en clase y cuatro mejoras complementarias. El diseño no utiliza bibliotecas de terceros ni requiere conexión a internet.

## 2. Cómo ejecutarlo

1. Entra a la carpeta `motionlab-css`.
2. Abre `index.html` en Chrome, Edge o un navegador moderno.
3. Alternativa: utiliza **Live Server** de VS Code sobre `index.html`.

**Importante:** conserva la estructura de carpetas. Los estilos, el script y las imágenes SVG utilizan rutas relativas.

## 3. Estructura del proyecto

```text
motionlab-css/
├── index.html             # Estructura y contenido semántico
├── css/
│   └── styles.css         # Diseño responsivo, efectos y @keyframes
├── js/
│   └── main.js            # Menús, ripple, loader, tema y respaldo de scroll
├── assets/
│   ├── favicon.svg
│   ├── orbitas.svg
│   ├── ondas.svg
│   ├── prisma.svg
│   └── trayectorias.svg
└── README.md              # Guía para ejecutar y sustentar
```

## 4. Efectos y cómo sustentarlos

| Efecto | Dónde verlo | CSS relevante | JavaScript |
|---|---|---|---|
| 1. Menú hamburguesa | Cabecera en móvil y tarjeta 01 | `transition`, `::before`, `::after`, `@keyframes menu-enter` | Agrega o quita `is-open` y actualiza `aria-expanded`. |
| 2. Botón ripple | Tarjeta 02 y botones principales | `@keyframes ripple-expand`, `transform: scale()`, `opacity`, `overflow: hidden` | Lee `getBoundingClientRect()`, crea un `<span>` temporal y lo elimina al terminar la animación. |
| 3. Loader giratorio | Tarjeta 03 | `@keyframes spin`, `rotate(360deg)`, `linear infinite` | Simula una espera de 1,8 s con `setTimeout()` y cambia el texto de estado. |
| 4. Animación al hacer scroll | Galería y otras secciones | `animation-timeline: view(block)`, `animation-range`, `@keyframes reveal-enter` | Si no hay soporte CSS, utiliza `IntersectionObserver`. |

### Mejoras adicionales

- **Hover avanzado:** tarjetas que se elevan mediante `transform: translateY(-7px)`.
- **Aparición progresiva y escalonada:** revelado al entrar en pantalla y entrada inicial del hero con `animation-delay`.
- **Progreso de lectura:** `animation-timeline: scroll(root block)` con alternativa JavaScript.
- **Tema y accesibilidad:** modo claro/oscuro persistente, enlaces y botones accesibles, compatibilidad con teclado y `prefers-reduced-motion`.

## 5. Conceptos fundamentales para la exposición

- **`@keyframes`**: define estados de una animación, por ejemplo de `0deg` a `360deg`.
- **`animation`**: relaciona el nombre de los `@keyframes` con duración, curva temporal y repeticiones.
- **`transition`**: interpola el cambio entre dos estados CSS, por ejemplo en `:hover` o cuando se añade una clase.
- **`transform`**: desplaza, rota o escala un elemento sin modificar el flujo del documento.
- **`position: relative` y `absolute`**: permiten ubicar la onda dentro del botón y no respecto a toda la página.
- **`animation-timeline: view()`**: vincula el avance de la animación a la visibilidad del propio elemento al desplazarse.
- **`animation-timeline: scroll()`**: vincula el avance de la barra superior a la posición de desplazamiento de la página.
- **`prefers-reduced-motion`**: evita efectos innecesarios cuando el sistema solicita menos movimiento.

## 6. Pruebas manuales recomendadas

1. En escritorio, abre la tarjeta **Menú hamburguesa**: debe desplegar tres enlaces, cambiar el icono a una X y cerrarse con `Escape`.
2. En un ancho de **375 px**, abre el menú de la cabecera; el contenido no debe salir de pantalla.
3. Haz clic en distintas posiciones del botón **Haz clic aquí**: la onda debe surgir del sitio pulsado y aumentar el contador.
4. Pulsa **Simular carga**: el botón debe bloquearse mientras aparece el estado de espera y reactivarse tras la simulación.
5. Baja por la página: las tarjetas deben aparecer y la barra superior debe avanzar.
6. Cambia de tema y actualiza la página: debe mantenerse la opción elegida, si el almacenamiento local está disponible.
7. Prueba a navegar utilizando `Tab`, `Enter` y `Escape`.
8. Habilita **reducir movimiento** en tu sistema operativo para observar la alternativa sin animaciones.

## 7. Aclaraciones técnicas

- La **simulación de carga** es deliberada; no hay peticiones a un servidor.
- `animation-timeline` tiene compatibilidad desigual. Por eso se utiliza `@supports` y un respaldo con `IntersectionObserver`.
- Los gráficos SVG incluidos son originales y locales; no se depende de imágenes remotas.
- Para fines de aprendizaje, CSS y JavaScript contienen comentarios **solo en las partes relevantes**.

## 8. Fuentes de consulta

- MDN Web Docs. `@keyframes`: https://developer.mozilla.org/es/docs/Web/CSS/@keyframes
- MDN Web Docs. `animation-timeline`: https://developer.mozilla.org/en-US/docs/Web/CSS/animation-timeline
- MDN Web Docs. Scroll-driven animations: https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_scroll-driven_animations
- MDN Web Docs. `prefers-reduced-motion`: https://developer.mozilla.org/en-US/docs/Web/CSS/@media/prefers-reduced-motion
