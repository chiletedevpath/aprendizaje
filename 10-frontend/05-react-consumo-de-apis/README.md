# 05 · Consumo de APIs con React

El acceso a datos remotos debe separar la configuración del cliente, el estado de la solicitud y la presentación del resultado. Esta etapa compara `fetch`, Axios y Alova para observar el mismo flujo sin ocultar los estados asíncronos.

## Qué debes dominar

- cliente HTTP y URL base;
- solicitudes bajo demanda;
- estados de carga, éxito, vacío y error;
- validación antes de consultar;
- datos remotos renderizados de forma condicional.

## Prácticas

- `practicas/buscador-publicaciones-alova` consulta publicaciones ficticias de JSONPlaceholder por identificador y muestra de manera visible todos los estados de la petición.
- `practicas/explorador-apis-publicas-alova` amplía el recorrido con dos clientes, paginación, consulta de detalle, validación y manejo de límites o recursos inexistentes en GitHub y DummyJSON.
- `practicas/explorador-jsonplaceholder-fetch-axios` compara una carga con `fetch`, filtrado local, peticiones encadenadas con Axios y cancelación mediante `AbortController`.

Las consultas requieren conexión a Internet. Ejecuta cada práctica con `npm ci` y `npm run dev`.

## Reto

Implementa una búsqueda por usuario, cancela la solicitud anterior cuando cambie el criterio y explica cuándo conviene almacenar una respuesta en caché.

Contenido adaptado para Chilete DevPath con apoyo de IA para estructuración y revisión. El criterio, selección y validación final corresponden a Adrian Pisco, autor de Chilete DevPath.
