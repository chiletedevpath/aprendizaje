import java.time.LocalDate

@main def bibliotecaEstandar(): Unit =
  val valor = 81.0
  // math reutiliza operaciones matemáticas disponibles en la biblioteca estándar.
  println(s"Raíz: ${math.sqrt(valor)}")

  val hoy = LocalDate.now()
  println(s"Hoy: $hoy")
