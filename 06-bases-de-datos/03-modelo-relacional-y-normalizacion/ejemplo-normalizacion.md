# Ejemplo breve — normalización

Registro inicial:

```text
matricula(estudiante, correo, curso, docente, correo_docente, nota)
```

Si un docente aparece en muchas matrículas, su correo se repite. Una separación posible es:

```text
estudiante(id, nombre, correo)
docente(id, nombre, correo)
curso(id, nombre, docente_id)
matricula(estudiante_id, curso_id, nota)
```

La normalización reduce redundancia, pero siempre debe verificarse contra las reglas reales del dominio.
