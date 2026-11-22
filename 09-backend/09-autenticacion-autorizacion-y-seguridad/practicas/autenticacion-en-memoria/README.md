# Autenticación en memoria

Primera práctica de seguridad de la ruta backend de Chilete DevPath. Permite observar el flujo de autenticación de Spring Security sin añadir todavía una base de datos.

## Conceptos aplicados

- `SecurityFilterChain` protege las rutas y deja públicos el acceso y los estilos.
- `UserDetailsService` proporciona un único usuario didáctico en memoria.
- BCrypt almacena internamente la contraseña como hash durante la ejecución.
- una página de acceso propia reemplaza el formulario predeterminado.
- la sesión conserva la autenticación hasta ejecutar el cierre de sesión.

## Ejecutar

Desde esta carpeta:

```powershell
.\mvnw.cmd spring-boot:run
```

Abre `http://localhost:8080/home`. Las credenciales predeterminadas son:

- usuario: `estudiante`
- contraseña: `Aprende123!`

Se pueden reemplazar localmente mediante `DEMO_USERNAME` y `DEMO_PASSWORD`. Estas credenciales solo existen para la práctica y no representan una estrategia válida de usuarios para producción.

## Comprobar

1. Sin iniciar sesión, `/home` debe redirigir a `/login`.
2. Una contraseña incorrecta debe mostrar un error.
3. Las credenciales didácticas deben abrir la vista protegida.
4. Cerrar sesión debe impedir volver a la ruta protegida sin autenticarse.

```powershell
.\mvnw.cmd test
```

El siguiente paso de la ruta es `autenticacion-con-jpa-h2`, donde el usuario deja de estar codificado en memoria y se recupera desde un repositorio JPA.

Contenido creado para Chilete DevPath con apoyo de IA para estructuración y revisión. El criterio, selección y validación final corresponden a Adrian Pisco, autor de Chilete DevPath.
