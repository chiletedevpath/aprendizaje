# 02 · Servicios HTTP y APIs con Angular

Este bloque amplía los fundamentos de componentes y formularios. Su objetivo es separar la interfaz del acceso a datos y representar con claridad los estados de carga, éxito, vacío y error.

## Qué debes dominar

- servicios inyectables y responsabilidad de cada capa;
- `HttpClient` y observables;
- peticiones GET y POST tipadas;
- parámetros de consulta con `HttpParams`;
- formularios dirigidos por plantilla y validación;
- consumo de una API local simulada y de una API pública;
- manejo básico de carga y errores en la interfaz.

## Práctica

`practicas/servicios-http-json-server` integra cuatro piezas progresivas:

1. lista y registro local de usuarios;
2. estilos dinámicos con `NgStyle`;
3. consulta y registro de alumnos mediante `json-server`;
4. consulta paginada de álbumes desde JSONPlaceholder.

Para ejecutarla:

```powershell
npm ci
npm run backend
```

En otra terminal, dentro de la misma práctica:

```powershell
npm start
```

La gestión de alumnos funciona con `db.json` en `http://localhost:3000`. La consulta de álbumes requiere conexión a Internet porque utiliza una API pública.

## Reto

Extrae las URL de las APIs a una configuración, añade edición de alumnos con PUT o PATCH y muestra mensajes distintos para errores de validación, red y recurso inexistente.

## Para avanzar

Debes poder explicar por qué los componentes no deberían construir peticiones HTTP directamente, cómo se suscribe la interfaz a un observable y qué estados debe comunicar mientras espera una respuesta.

Contenido adaptado para Chilete DevPath con apoyo de IA para estructuración y revisión. El criterio, selección y validación final corresponden a Adrian Pisco, autor de Chilete DevPath.
