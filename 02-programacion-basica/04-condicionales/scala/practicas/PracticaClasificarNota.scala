@main def practicaClasificarNota(): Unit =
  val nota = 16

  // Las condiciones se evalúan de arriba hacia abajo hasta encontrar una rama válida.
  val estado =
    if nota < 0 || nota > 20 then "Fuera de rango"
    else if nota >= 18 then "Excelente"
    else if nota >= 11 then "Aprobado"
    else "Desaprobado"

  println(estado)
