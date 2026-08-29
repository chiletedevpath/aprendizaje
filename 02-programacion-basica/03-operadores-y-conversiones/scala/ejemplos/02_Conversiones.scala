@main def conversiones(): Unit =
  val promedio = 17.8
  // toInt descarta la parte decimal; no redondea.
  val parteEntera = promedio.toInt
  // toInt convierte una cadena numérica a entero y falla si el formato no es válido.
  val edad = "21".toInt

  println(s"parte=$parteEntera, edad=$edad")
