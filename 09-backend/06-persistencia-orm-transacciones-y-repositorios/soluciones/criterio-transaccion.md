# Criterio de solución

La búsqueda de alumno, curso, comprobación de duplicidad y escritura deben formar una operación de negocio coherente. La escritura se realiza dentro del límite transaccional del servicio. Un conflicto de matrícula debe representarse como error de negocio y no como un `500` genérico.
