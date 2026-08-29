# 08 · Integración

El cierre del módulo consiste en diseñar un sistema pequeño donde los patrones aparezcan por necesidad, no por cuota.

## Caso propuesto

**Gestión de notificaciones de cursos**

El sistema debe registrar eventos de curso, notificar cambios, soportar varios canales y poder integrar un proveedor externo.

Posibles herramientas de diseño:

- Observer para suscriptores a cambios;
- Adapter para proveedor externo;
- Strategy para políticas seleccionables;
- Factory Method para creación variable;
- Facade para simplificar el uso desde el cliente;
- Command si las acciones deben almacenarse o ejecutarse después.

No es obligatorio usar todos. La entrega debe justificar cada patrón y también indicar al menos un patrón descartado.
