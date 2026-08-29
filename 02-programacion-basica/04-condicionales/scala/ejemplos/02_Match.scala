@main def ejemploMatch(): Unit =
  val opcion = 2

  // match compara un valor con patrones y devuelve la rama coincidente.
  val resultado = opcion match
    case 1 => "Java"
    case 2 => "Scala"
    case _ => "Opción no disponible"

  println(resultado)
