# Mapa conceptual

```text
Aplicación
   ↓ consulta / modifica
SGBD
   ├── esquema
   ├── seguridad
   ├── concurrencia
   ├── recuperación
   └── almacenamiento
          ↓
       datos persistentes
```

Un SGBD administra datos y reglas de acceso. La aplicación utiliza esos servicios; no reemplaza los mecanismos de integridad y transacción del motor.
