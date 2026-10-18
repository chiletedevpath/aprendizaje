# Gestión de personas con Spring MVC y JPA

Práctica educativa de Chilete DevPath para recorrer un CRUD completo con Java 17, Spring Boot 3.5.6, Spring MVC, Spring Data JPA, Thymeleaf y MySQL.

## Conceptos aplicados

- separación entre controlador, servicio y repositorio;
- entidad JPA, identificador autogenerado y validación declarativa;
- renderizado del lado del servidor con Thymeleaf;
- patrón Post/Redirect/Get y mensajes temporales;
- operaciones de creación, consulta, actualización y eliminación;
- configuración local mediante variables de entorno.

## Requisitos

- JDK 17 o superior.
- IDE compatible con proyectos Maven (Spring Tool Suite, Eclipse, IntelliJ IDEA o VS Code).
- XAMPP con el módulo MySQL activo (puerto 3306 por defecto).
- No es necesario instalar Maven: el proyecto incluye Maven Wrapper para Windows y otros sistemas.

## 1. Preparar la base de datos

1. Iniciar **MySQL** en el panel de XAMPP.
2. Abrir **http://localhost/phpmyadmin**; para acceder mediante esa URL, iniciar también Apache.
3. Ir a la pestaña **SQL** y ejecutar el contenido de `database/crear_base_datos.sql`.
4. Confirmar que aparece la base de datos `chilete_personas`.

La tabla `persona` se crea automáticamente la primera vez que se inicia la aplicación, mediante `spring.jpa.hibernate.ddl-auto=update`.

## 2. Revisar la conexión

El archivo `src/main/resources/application.properties` contiene:

```properties
spring.datasource.url=${DB_URL:jdbc:mysql://127.0.0.1:3306/chilete_personas?useSSL=false&serverTimezone=America/Lima&characterEncoding=UTF-8}
spring.datasource.username=${DB_USER:root}
spring.datasource.password=${DB_PASSWORD:}
```

Los valores predeterminados están preparados para una instalación local de XAMPP con usuario `root` sin contraseña. Si tu MySQL tiene credenciales distintas, configura las variables de entorno `DB_USER` y `DB_PASSWORD` antes de iniciar el programa o cambia sus valores locales.

Si MySQL utiliza otro puerto, sustituye `3306` por el puerto correspondiente.

## 3. Ejecutar el proyecto

### Spring Tool Suite / Eclipse

1. Descomprimir el proyecto.
2. Seleccionar **File > Import > Maven > Existing Maven Projects**.
3. Elegir la carpeta `gestion-personas-thymeleaf` que contiene `pom.xml`.
4. Esperar a que Maven descargue las dependencias.
5. Ejecutar `GestionPersonasApplication.java` con **Run As > Spring Boot App** o **Java Application**.
6. Abrir **http://localhost:8080/listar**.

### Terminal

Ubicado en la carpeta de la práctica, ejecutar en Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

## Rutas y operaciones

| Método | Ruta | Operación |
|---|---|---|
| GET | `/` o `/listar` | Mostrar personas registradas |
| GET | `/nuevo` | Abrir formulario de registro |
| POST | `/guardar` | Guardar un nuevo registro o actualizar uno existente |
| GET | `/editar/{id}` | Abrir formulario de edición |
| POST | `/eliminar/{id}` | Eliminar un registro |

## Organización del código

- `model/Persona.java`: entidad JPA y validaciones de los campos.
- `repository/PersonaRepository.java`: acceso a datos mediante Spring Data.
- `service/PersonaService.java`: contrato de las operaciones del caso de uso.
- `service/PersonaServiceImpl.java`: implementación del servicio.
- `controller/PersonaController.java`: rutas y procesamiento de solicitudes.
- `templates/index.html`: listado de personas.
- `templates/formulario.html`: registro y edición.
- `static/css/estilos.css`: diseño adaptable, transiciones y animaciones.

## Prueba manual del CRUD

1. Abrir `/listar`: si la tabla está vacía, aparecerá un mensaje de bienvenida.
2. Seleccionar **Nueva persona** y registrar un nombre y un teléfono.
3. Comprobar que aparece el registro en el listado y en phpMyAdmin, en `chilete_personas > persona`.
4. Seleccionar **Editar**, modificar el teléfono y guardar.
5. Seleccionar **Eliminar**, confirmar y verificar que el registro desapareció.

**Observación:** el proyecto está configurado para aprendizaje y desarrollo local. Para despliegue público se deben añadir autenticación, autorización, controles de seguridad y configuración de base de datos para producción.

Contenido adaptado para Chilete DevPath con apoyo de IA para estructuración y revisión. El criterio, selección y validación final corresponden a Adrian Pisco, autor de Chilete DevPath.
