@main def validacion(): Unit =
  val nota = 25

  // Se valida el dominio antes de procesar el dato.
  if nota < 0 || nota > 20 then
    println("Nota fuera de rango")
  else
    println(s"Nota válida: $nota")
