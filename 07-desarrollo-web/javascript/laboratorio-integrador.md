# Laboratorio integrador: catálogo web de recursos

## Propósito

Construir una interfaz pequeña que integre HTML, CSS y JavaScript sin frameworks.

## Requisitos funcionales

1. Mostrar una lista inicial de recursos ficticios.
2. Permitir agregar un recurso mediante formulario.
3. Validar código único, título no vacío, nivel permitido y duración positiva.
4. Filtrar por texto y nivel sin recargar la página.
5. Marcar un recurso como completado y reflejar el estado visualmente.
6. Eliminar un recurso previa confirmación explícita.
7. Conservar el catálogo en `localStorage` y ofrecer una acción para restaurar datos demostrativos.

## Requisitos técnicos

- HTML semántico y etiquetas asociadas a los campos;
- navegación completa con teclado y foco visible;
- mensajes de validación comprensibles;
- módulos JavaScript separados por responsabilidad;
- diseño funcional desde 320 px;
- respeto por `prefers-reduced-motion`;
- ningún dato personal, credencial o servicio externo.

## Casos de prueba

Prueba colección vacía, código repetido, duración inválida, filtro sin resultados, recarga con datos guardados y restauración del catálogo.

## Evidencia

Incluye una tabla de casos, capturas de escritorio y móvil, explicación de la estructura de archivos y una conclusión sobre accesibilidad y estado persistente.
