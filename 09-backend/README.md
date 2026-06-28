# Backend

Esta seccion organiza ejercicios de aprendizaje sobre desarrollo backend, APIs, persistencia, seguridad, pruebas e integraciones externas.

## Objetivo

Comprender como se construyen servicios backend: recibir solicitudes, aplicar reglas de negocio, conectar con bases de datos, exponer APIs y proteger configuraciones sensibles.

## Publico objetivo

Este modulo esta dirigido a:

- estudiantes que ya entienden Java, POO y bases de datos;
- personas que quieren construir APIs con Spring Boot;
- miembros de la comunidad Chilete DevPath que buscan pasar de ejercicios a servicios reales;
- estudiantes que necesitan aprender configuracion segura antes de publicar codigo.

## Prerrequisitos recomendados

Antes de iniciar este modulo, conviene poder:

- crear clases, interfaces y servicios;
- leer SQL y modelos relacionales;
- entender HTTP, endpoints y JSON;
- diferenciar datos reales de datos ficticios;
- usar variables de entorno para credenciales.

## Material de apoyo

- `glosario.md`: terminos esenciales de backend y APIs.
- `ejercicios-comunidad.md`: retos propuestos para practicar APIs, persistencia, seguridad y pruebas.

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

## Criterio de avance

Este modulo se considera logrado cuando puedes:

- crear un endpoint y explicar su responsabilidad;
- separar controlador, servicio, repositorio y modelo;
- conectar una API a una base de datos usando configuracion segura;
- manejar errores sin filtrar informacion sensible;
- usar variables de entorno para tokens y contrasenas;
- probar servicios con casos normales y casos limite;
- explicar cuando una integracion externa no debe publicarse sin revision legal o contractual.

## Buenas prácticas del módulo

En backend no basta con que un endpoint responda. También debes cuidar configuración, errores y datos de prueba:

- usa variables de entorno para tokens, claves y contraseñas;
- evita subir credenciales en `application.properties`;
- separa controladores, servicios, repositorios y modelos;
- maneja errores sin mostrar información interna;
- usa datos ficticios cuando el ejercicio necesite nombres, documentos o correos;
- revisa las condiciones de uso si consumes una API externa.

## Autoría y fuentes

El contenido corresponde a ejercicios desarrollados por Adrián Pisco durante su proceso de aprendizaje. Si algún ejercicio futuro se adapta desde una fuente externa, debe indicarse la referencia.
