# Laboratorio integrador: catálogo indexado de recursos

## Propósito

Combinar dos estructuras con responsabilidades distintas:

- una lista conserva el orden de registro;
- una tabla hash localiza recursos por código.

## Requerimiento

Cada recurso tiene código positivo, título y tipo. El catálogo debe permitir:

- registrar sin aceptar códigos duplicados;
- consultar por código;
- eliminar un recurso;
- mostrar los recursos en su orden de registro.

## Decisiones que debes justificar

1. ¿Por qué la lista sirve para conservar el orden?
2. ¿Por qué la tabla hash sirve como índice por código?
3. ¿Cómo se resuelven las colisiones?
4. ¿Qué estructuras deben actualizarse al eliminar?
5. ¿Qué ocurriría si solo se usara una lista?

## Casos de prueba

1. Registrar tres recursos.
2. Provocar una colisión.
3. Intentar un código duplicado.
4. Consultar un código existente y uno ausente.
5. Eliminar el primer recurso y uno inexistente.
6. Mostrar el orden final.

## Límite con algoritmos

Este laboratorio implementa las operaciones necesarias para mantener ambas
estructuras consistentes. No compara estrategias de búsqueda ni ordenamiento;
ese análisis corresponde a `05-algoritmos`.

## Referencia

Después de resolver tu versión, compárala con
`practicas-integradoras/java/catalogo-indexado`.
