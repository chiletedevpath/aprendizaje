# Glosario de backend

Este glosario resume conceptos usados en los ejercicios de `09-backend`.

| Termino | Significado practico |
|---|---|
| Backend | Parte del sistema que procesa reglas, datos, seguridad e integraciones. |
| API | Interfaz para que otros sistemas o clientes consuman funcionalidades. |
| Endpoint | Ruta expuesta por una API para una operacion concreta. |
| Controlador | Clase que recibe solicitudes HTTP y delega la logica. |
| Servicio | Clase que contiene reglas de negocio. |
| Repositorio | Componente que accede a datos. |
| DTO | Objeto usado para transportar datos entre capas o hacia el cliente. |
| Persistencia | Almacenamiento de datos en una base de datos u otro medio. |
| Variable de entorno | Configuracion externa usada para no versionar secretos. |
| Token | Credencial temporal o clave de acceso que no debe exponerse. |
| JWT | Token firmado usado en autenticacion y autorizacion. |
| Prueba unitaria | Prueba enfocada en una unidad pequena de codigo. |
| Arquitectura hexagonal | Estilo que separa dominio, puertos y adaptadores. |
| Integracion externa | Comunicacion con un servicio de terceros. |

## Criterio de uso

Un backend publicable debe separar responsabilidades, proteger configuraciones sensibles y evitar datos reales en ejemplos.
