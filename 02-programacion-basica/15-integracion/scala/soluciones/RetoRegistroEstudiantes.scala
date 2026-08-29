def registrar(nombres: List[String], notas: List[Int], nombre: String, nota: Int): (List[String], List[Int]) =
  require(nombre.trim.nonEmpty, "Nombre vacío")
  require(nota >= 0 && nota <= 20, "Nota fuera de rango")
  (nombres :+ nombre.trim, notas :+ nota)

def promedio(notas: List[Int]): Double = if notas.isEmpty then 0.0 else notas.sum.toDouble / notas.size

@main def retoRegistroEstudiantes(): Unit =
  var nombres = List.empty[String]
  var notas = List.empty[Int]

  val r1 = registrar(nombres, notas, "Ana", 18); nombres = r1._1; notas = r1._2
  val r2 = registrar(nombres, notas, "Luis", 14); nombres = r2._1; notas = r2._2

  // zip mantiene relacionados los datos almacenados en las dos listas.
  nombres.zip(notas).foreach { case (nombre, nota) => println(s"$nombre -> $nota") }
  println(f"Promedio: ${promedio(notas)}%.2f")
