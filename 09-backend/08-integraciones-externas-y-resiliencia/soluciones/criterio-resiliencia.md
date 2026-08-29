# Criterio de solución

Usa un timeout explícito, traduce el error del proveedor a una excepción propia y evita propagar su contrato directamente. Los reintentos deben ser limitados y aplicarse solo cuando la operación sea segura. Un fallback solo es correcto si puede devolver información válida y no engañosa.
