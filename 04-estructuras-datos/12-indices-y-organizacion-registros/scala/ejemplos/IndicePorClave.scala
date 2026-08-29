case class Cliente(dni: String, nombre: String)

object IndicePorClave:
  def main(args: Array[String]): Unit =
    val archivo = Vector(Cliente("100", "Ana"), Cliente("200", "Luis"))
    // zipWithIndex permite construir un índice clave -> posición.
    val indice = archivo.zipWithIndex.map((cliente, pos) => cliente.dni -> pos).toMap
    println(archivo(indice("200")))
