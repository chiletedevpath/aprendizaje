case class Curso(codigo: String, nombre: String)

object CombinarEstructuras:
  def main(args: Array[String]): Unit =
    val cursos = Vector(Curso("SCALA-01", "Scala básico"))
    val porCodigo = cursos.map(c => c.codigo -> c).toMap
    val categorias = Set("Programación")
    // Cada estructura conserva una responsabilidad diferente.
    println(porCodigo("SCALA-01"))
    println(categorias)
