# Solución de referencia

| Recurso | Anónimo | Usuario | Admin |
|---|---|---|---|
| `/api/publico` | Permitido | Permitido | Permitido |
| `/api/perfil` | 401 | Permitido | Permitido |
| `/api/admin/**` | 401 | 403 | Permitido |

`401` indica que falta una identidad válida. `403` indica que existe identidad, pero no posee el permiso necesario.
