# 05 · Capa web, controladores, DTO y validación

La capa web traduce HTTP hacia operaciones de aplicación y transforma el resultado nuevamente en una respuesta HTTP.

**Aprenderás:** `@RestController`, mappings, DTO, `@Valid`, `ResponseEntity`, errores y `@RestControllerAdvice`.

**Reto:** diseña un endpoint de creación que rechace entradas inválidas y no exponga directamente la entidad persistida.

## Práctica con vistas del servidor

`practicas/registro-estudiantes-thymeleaf` muestra el flujo MVC completo: rutas GET y POST, enlace de formulario con `th:object` y `th:field`, atributos del modelo, iteración con `th:each` y condiciones con `th:if` y `th:unless`. Es una práctica con datos en memoria; no sustituye la persistencia del módulo 06.
