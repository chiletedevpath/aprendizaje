# Carta de cumpleaños interactiva con React

Práctica integradora de Chilete DevPath construida con React y Vite. Presenta siete escenas y combina composición, estado, efectos, eventos de teclado y táctiles, audio y animaciones CSS. No requiere backend.

## Ejecutar

```powershell
npm ci
npm run dev
```

Para comprobar la versión de producción usa `npm run build`.

## Conceptos que debes observar

- cada escena se representa mediante un componente;
- las propiedades comunican acciones y contenido;
- `useState` conserva escena, tema, galería y controles interactivos;
- `useEffect` registra y limpia eventos de teclado, y coordina efectos secundarios;
- los textos viven en `src/data/contenido.js`, separados de la lógica;
- los gestos táctiles ignoran controles que ya tienen su propia interacción;
- el audio solo comienza después de una acción del usuario;
- la interfaz contempla foco visible y movimiento reducido.

La primera escena contiene una explicación desplegable para relacionar el resultado visual con el código.

## Personalizar con privacidad

Modifica únicamente los valores de `src/data/contenido.js` y sustituye los SVG de demostración dentro de `public/images/recuerdos/` por recursos propios o autorizados. Optimiza las fotografías antes de agregarlas.

Esta aplicación estática no ofrece autenticación. Si publicas fotografías personales, la URL y los archivos pueden quedar accesibles. No coloques una contraseña dentro del JavaScript como supuesto mecanismo de protección.

La melodía y las cuatro ilustraciones incluidas son recursos de demostración del material original. Lucide React se utiliza para los iconos bajo su licencia ISC.

Contenido adaptado para Chilete DevPath con apoyo de IA para estructuración y revisión. El criterio, selección y validación final corresponden a Adrian Pisco, autor de Chilete DevPath.
