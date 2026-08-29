# 07 · Refactorización, selección y antipatrones

La habilidad importante no es usar más patrones, sino elegir la solución adecuada.

## Flujo recomendado

1. Identifica el problema observable.
2. Aísla qué cambia y qué permanece estable.
3. Implementa o imagina la solución más simple.
4. Evalúa si un patrón reduce acoplamiento, duplicación o condicionales crecientes.
5. Compara el costo del patrón con el beneficio real.

## Antipatrones y riesgos

- God Object;
- Singleton usado como variable global;
- herencia innecesaria;
- interfaces gigantes;
- abstracción prematura;
- factories triviales;
- patrón aplicado solo para demostrar que se conoce.

## Reto

Refactoriza un procesador con múltiples `if/else` por tipo de notificación. No estás obligado a usar Strategy o Factory: primero demuestra si el patrón realmente mejora el diseño.
