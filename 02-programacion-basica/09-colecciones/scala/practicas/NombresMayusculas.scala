object NombresMayusculas {
  def main(args: Array[String]): Unit = {
    val nombres = List("Adrian", "Carlos", "Maria", "Lucia")
    val nombresEnMayusculas = nombres.map(nombre => nombre.toUpperCase)

    println("Nombres originales: " + nombres)
    println("Nombres en mayúsculas: " + nombresEnMayusculas)
  }
}
