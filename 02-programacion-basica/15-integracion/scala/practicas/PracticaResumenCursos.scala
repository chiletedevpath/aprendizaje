@main def practicaResumenCursos(): Unit =
  val cursos = List(("Java", 80), ("Scala", 45), ("Git", 70))
  // filter conserva solo los elementos que cumplen la regla indicada.
  val avanzados = cursos.filter { case (_, avance) => avance >= 70 }
  val promedio = cursos.map(_._2).sum.toDouble / cursos.size

  avanzados.foreach { case (nombre, avance) => println(s"$nombre: $avance%") }
  println(f"Promedio general: $promedio%.2f%%")
