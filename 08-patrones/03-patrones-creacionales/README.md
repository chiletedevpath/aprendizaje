# 03 · Patrones creacionales

Los patrones creacionales controlan **cómo y dónde nacen los objetos**.

| Patrón | Úsalo cuando... |
|---|---|
| Singleton | necesitas una instancia controlada y el costo global está justificado. |
| Factory Method | una clase delega a subclases o creadores concretos qué producto construir. |
| Abstract Factory | necesitas familias coherentes de objetos relacionados. |
| Builder | un objeto tiene construcción gradual, opcional o con muchas combinaciones. |
| Prototype | crear una copia configurada resulta más conveniente que reconstruirla. |

## Reto

Construye un módulo de exportación que permita crear exportadores PDF y CSV sin llenar la clase cliente de `new` y condicionales. Elige Factory Method o Abstract Factory y explica por qué.
