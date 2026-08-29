# Retos: clases, módulos y errores

1. Crea una clase `Recurso` que valide código, título y duración desde el constructor.
2. Especializa `RecursoVideo` y sobrescribe únicamente el comportamiento que realmente cambia.
3. Encapsula el avance mediante un campo privado y controla sus cambios con métodos o propiedades de acceso.
4. Define un error `DatoInvalidoError` y úsalo para distinguir errores de validación de fallos inesperados.
5. Divide validación, modelo y demostración en módulos distintos. Documenta cómo servir el ejemplo localmente.
6. Simula una operación inestable que pueda reintentarse como máximo tres veces. Detén los reintentos si el error no es recuperable.

## Casos obligatorios

- objeto válido;
- duración igual a cero;
- código repetido;
- importación correcta;
- error controlado y error inesperado.
