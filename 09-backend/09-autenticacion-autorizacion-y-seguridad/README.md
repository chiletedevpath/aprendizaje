# 09 · Autenticación, autorización y seguridad

Autenticar demuestra quién es el usuario; autorizar decide qué puede hacer. La seguridad debe atravesar la API sin introducir secretos en el repositorio.

**Aprenderás:** hash de contraseñas, roles, permisos, Spring Security, JWT, `401`/`403`, CORS, CSRF y manejo seguro de secretos.

**Reto:** define tres endpoints: público, autenticado y administrativo, indicando qué respuesta corresponde cuando falta identidad o permiso.

## Prácticas progresivas

1. `practicas/autenticacion-en-memoria`: formulario de acceso, contraseña BCrypt y usuario didáctico sin base de datos.
2. `practicas/autenticacion-con-jpa-h2`: el mismo flujo, pero recuperando el usuario mediante JPA desde H2 en memoria.
3. `practicas/seguridad`: extensión hacia una API con roles y JWT.

Las credenciales incluidas en las dos primeras prácticas son públicas y exclusivamente didácticas. No deben reutilizarse en sistemas reales.
