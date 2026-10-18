# 06 · Persistencia, ORM, transacciones y repositorios

JPA/Hibernate conecta objetos Java con tablas relacionales. El objetivo es comprender el mapeo y los límites transaccionales, no reemplazar el conocimiento SQL.

**Aprenderás:** `@Entity`, identificadores, repositories, relaciones, consultas, CRUD, `@Transactional`, lazy/eager y N+1 introductorio.

## Práctica integrada

`practicas/gestion-personas-thymeleaf` conecta una interfaz renderizada en el servidor con Spring MVC, Bean Validation, una capa de servicio, Spring Data JPA y MySQL. Permite observar un CRUD completo sin confundir la vista, las reglas de aplicación y el acceso a datos.

**Reto:** registra una matrícula garantizando que alumno y curso existan y que una operación incompleta no deje datos inconsistentes.
