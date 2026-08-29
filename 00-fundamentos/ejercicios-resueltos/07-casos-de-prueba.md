# Solución 07 · Diseñar casos de prueba

[Volver al ejercicio](../ejercicios-propuestos/07-casos-de-prueba.md)

| Tipo | Entrada | Resultado esperado |
|---|---:|---|
| Normal | S/ 125 | Envío gratuito |
| Normal | S/ 80 | Envío con costo |
| Límite | S/ 100 | Envío gratuito |
| Inválido | S/ -10 | Rechazar el total |
| Inválido | sin valor | Solicitar o informar el dato faltante |

## Criterio clave

El caso de **S/ 100** comprueba exactamente la frontera establecida por la expresión “igual o mayor”.
