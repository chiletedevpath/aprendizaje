# Spring Boot

Ejercicios y proyectos de aprendizaje backend implementados con Spring Boot.

## Contenido

| Proyecto | Enfoque |
|---|---|
| `api-rest` | Fundamentos de controladores REST. |
| `api-bd` | Conexion con base de datos relacional. |
| `api-crud` | CRUD con entidades, DTO, repositorios y servicios. |
| `apis-externas` | Consumo de APIs externas con tokens por variable de entorno. |
| `seguridad` | Autenticacion, autorizacion y JWT. |
| `testing` | Pruebas unitarias, Jacoco y practica con SonarCloud. |
| `hexagonal` | Arquitectura hexagonal separando dominio, aplicacion e infraestructura. |

## Requisitos generales

- Java 17 o version compatible con cada `pom.xml`.
- Maven o Maven Wrapper.
- Base de datos local cuando el proyecto lo requiera.
- Variables de entorno para credenciales, tokens o claves.

## Seguridad

No versionar tokens, contrasenas ni claves reales. Los archivos actuales deben usar variables como `DB_PASSWORD`, `DECOLECTA_TOKEN`, `SONAR_TOKEN` o `TOKEN_VAULT`.

Si alguna credencial real fue usada antes de sanear el repositorio, debe rotarse o revocarse antes de usar el contenido como referencia publica.

## Uso comunitario

Para la futura web, cada proyecto debe convertirse en una guia separada con objetivo, arquitectura, variables de entorno, comandos de ejecucion y advertencias de seguridad.
