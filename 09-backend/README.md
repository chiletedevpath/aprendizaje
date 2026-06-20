# Backend

Esta seccion organiza ejercicios de aprendizaje sobre desarrollo backend, APIs, persistencia, seguridad, pruebas e integraciones externas.

## Objetivo

Comprender como se construyen servicios backend: recibir solicitudes, aplicar reglas de negocio, conectar con bases de datos, exponer APIs y proteger configuraciones sensibles.

## Ruta sugerida

1. Revisar `spring-boot/api-rest` para entender controladores y endpoints basicos.
2. Continuar con `spring-boot/api-bd` y `spring-boot/api-crud` para practicar persistencia.
3. Avanzar a `spring-boot/apis-externas` para integraciones con servicios externos usando variables de entorno.
4. Estudiar `spring-boot/seguridad` para autenticacion y JWT.
5. Revisar `spring-boot/testing` para pruebas unitarias, cobertura y calidad.
6. Explorar `spring-boot/hexagonal` para arquitectura por capas y puertos/adaptadores.

## Contenido actual

| Carpeta | Enfoque |
|---|---|
| `spring-boot/api-rest` | API REST introductoria. |
| `spring-boot/api-bd` | Conexion con base de datos. |
| `spring-boot/api-crud` | CRUD con validaciones y persistencia. |
| `spring-boot/apis-externas` | Consumo de APIs externas y configuracion por entorno. |
| `spring-boot/seguridad` | Autenticacion, JWT y configuracion de seguridad. |
| `spring-boot/testing` | Pruebas, Jacoco y SonarCloud como practica educativa. |
| `spring-boot/hexagonal` | Arquitectura hexagonal con modulos separados. |

## Criterio Chilete DevPath

Los proyectos backend pueden exponer configuraciones sensibles si no se revisan correctamente. En este repositorio los valores actuales deben mantenerse como variables de entorno o placeholders seguros.

Antes de publicar contenido en una futura web, se debe revisar:

- historial Git;
- tokens o claves que pudieron existir antes;
- archivos `application.properties`;
- integraciones externas;
- datos personales usados como entrada de prueba;
- condiciones de uso de APIs externas.

## Autoria y fuentes

El contenido corresponde a ejercicios desarrollados por Adrian Pisco durante su proceso de aprendizaje. Si algun ejercicio futuro se adapta desde una fuente externa, debe indicarse la referencia antes de publicarlo.
