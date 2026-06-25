# Ejercicios para la comunidad

Estos retos complementan los ejercicios existentes de `09-backend`.

## API REST

1. Crear un endpoint `GET` que devuelva recursos ficticios.
2. Crear un endpoint `POST` con validacion de entrada.
3. Documentar que respuesta se espera para un caso correcto y uno incorrecto.

## Persistencia

1. Crear una entidad simple y su repositorio.
2. Guardar datos ficticios en una base local.
3. Consultar por identificador y manejar el caso no encontrado.

## Seguridad

1. Mover contrasenas y tokens a variables de entorno.
2. Validar que `application.properties` no tenga secretos reales.
3. Explicar por que un JWT no debe registrarse en logs.

## Testing

1. Probar un servicio con datos validos.
2. Probar un caso limite.
3. Probar una regla de negocio que lance excepcion.

## Arquitectura

1. Separar controlador, servicio y repositorio en un ejemplo pequeno.
2. Dibujar el flujo de una solicitud.
3. Explicar que capa no debe conocer detalles de infraestructura.

## Criterio para resolver

Antes de publicar un backend:

1. Revisa configuraciones.
2. Busca tokens, contrasenas y datos personales.
3. Usa datos ficticios.
4. Documenta requisitos de entorno.
5. Evita publicar llamadas reales a servicios externos si no hay permiso claro.
