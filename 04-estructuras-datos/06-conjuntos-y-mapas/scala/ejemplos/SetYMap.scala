object SetYMap:
  def main(args: Array[String]): Unit =
    val categorias = Set("Backend", "Backend", "Datos")
    val estudiantes = Map("U001" -> "Ana", "U002" -> "Luis")
    // Set conserva valores únicos y Map relaciona claves con valores.
    println(categorias)
    println(estudiantes("U002"))
