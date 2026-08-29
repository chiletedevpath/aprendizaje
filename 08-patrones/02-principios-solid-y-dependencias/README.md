# 02 · Principios SOLID y dependencias

## Ruta

| Tema | Pregunta clave |
|---|---|
| SRP | ¿Esta clase tiene más de un motivo relevante para cambiar? |
| OCP | ¿Puedo agregar una variante sin modificar lógica estable? |
| LSP | ¿Una implementación puede sustituir al contrato sin romper expectativas? |
| ISP | ¿Cada cliente depende solo de operaciones que realmente necesita? |
| DIP | ¿La lógica principal depende de abstracciones o de detalles concretos? |
| Composición | ¿Puedo colaborar con otro objeto en lugar de crear una jerarquía? |
| DI | ¿La clase recibe sus dependencias o las construye internamente? |

## Reto

Diseña un servicio de alertas que pueda guardar eventos y notificarlos por distintos canales. Debe ser posible sustituir almacenamiento y canal sin modificar la lógica principal.
