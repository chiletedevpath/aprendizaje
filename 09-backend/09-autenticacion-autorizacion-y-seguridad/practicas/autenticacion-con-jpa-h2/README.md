# Autenticación con JPA y H2

Segunda práctica de seguridad de la ruta backend de Chilete DevPath. Mantiene el flujo de Spring Security de la práctica anterior, pero reemplaza el usuario en memoria por un registro consultado mediante Spring Data JPA.

## Qué cambia respecto al nivel anterior

- `UsuarioRepository` busca el usuario en H2.
- la contraseña se persiste como hash BCrypt, nunca como texto legible.
- un `CommandLineRunner` crea el usuario didáctico al iniciar.
- la consola H2 permite inspeccionar el registro local.
- CSRF se mantiene activo para la aplicación y solo se excluye la consola H2.
- los frames se permiten únicamente desde el mismo origen para que funcione esa consola.

## Ejecutar

Desde esta carpeta:

```powershell
.\mvnw.cmd spring-boot:run
```

Abre `http://localhost:8080/home`. Las credenciales predeterminadas son `estudiante` / `Aprende123!`; pueden reemplazarse localmente con `DEMO_USERNAME` y `DEMO_PASSWORD`.

## Inspeccionar H2

Abre `http://localhost:8080/h2-console` y utiliza:

- JDBC URL: `jdbc:h2:mem:chilete_seguridad`
- usuario: `sa`
- contraseña: vacía

Después ejecuta:

```sql
SELECT USERNAME, PASSWORD, ROL FROM USUARIOS;
```

El valor de `PASSWORD` debe ser un hash BCrypt. La base es temporal y se reconstruye al reiniciar la aplicación.

## Pruebas

```powershell
.\mvnw.cmd test
```

Las pruebas confirman la redirección de rutas protegidas, el almacenamiento con hash y la autenticación contra el usuario persistido.

Contenido creado para Chilete DevPath con apoyo de IA para estructuración y revisión. El criterio, selección y validación final corresponden a Adrian Pisco, autor de Chilete DevPath.
