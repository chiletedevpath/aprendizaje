# Cafetería asíncrona

Práctica resuelta en JavaScript para comprender un flujo asíncrono antes de trabajar con peticiones HTTP o servicios externos.

## Objetivo

Simular la recepción y preparación de pedidos de una cafetería mediante operaciones que necesitan tiempo y pueden producir errores.

## Conceptos aplicados

- creación y consumo de Promesas;
- `async` y `await`;
- espera simulada con `setTimeout`;
- propagación de datos entre operaciones;
- errores con `throw` y `Error`;
- manejo de errores con `try/catch`;
- ejecución secuencial de casos de prueba.

## Flujo

1. `recibirPedido` comprueba si el producto pertenece al menú.
2. La función devuelve un objeto que conserva el producto y su estado.
3. `prepararCafe` recibe ese objeto y comprueba si la máquina está operativa.
4. `procesarPedido` coordina ambas operaciones con `await`.
5. Si una etapa falla, `catch` cancela el pedido y muestra la causa.

La falla de la máquina se controla mediante un parámetro. No se utiliza un valor aleatorio porque los mismos datos de prueba deben producir siempre el mismo resultado.

## Ejecución

Desde esta carpeta:

```bash
node app.js
```

## Casos incluidos

- `latte`: pedido válido que llega a entregarse.
- `té helado`: producto inexistente que se rechaza al recibirlo.
- `espresso` con la máquina inoperativa: producto válido que falla durante la preparación.

## Reto

Agrega un precio a cada producto y muestra el total solamente cuando el pedido llegue al estado `preparado`.
