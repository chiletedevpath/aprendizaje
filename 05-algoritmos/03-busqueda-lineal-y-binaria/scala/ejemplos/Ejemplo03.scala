object BusquedaBinaria:
  def buscar(datos: Array[Int], clave: Int): Int =
    var izq = 0; var der = datos.length - 1
    while izq <= der do
      val medio = izq + (der - izq) / 2
      if datos(medio) == clave then return medio
      // La búsqueda binaria requiere un orden total compatible con la comparación.
      if datos(medio) < clave then izq = medio + 1 else der = medio - 1
    -1

  @main def ejecutar(): Unit = println(buscar(Array(2, 5, 7, 9, 14, 20), 14))
