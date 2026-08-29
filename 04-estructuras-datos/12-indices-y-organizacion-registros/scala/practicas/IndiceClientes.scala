case class ClienteRegistro(dni: String, nombre: String)

object IndiceClientes:
  def main(args: Array[String]): Unit =
    val archivo = Vector(ClienteRegistro("100", "Ana"), ClienteRegistro("200", "Luis"))
    // El mapa funciona como índice porque relaciona DNI con posición del registro.
    val indice = archivo.zipWithIndex.map((cliente, posicion) => cliente.dni -> posicion).toMap
    println(archivo(indice("200")))
