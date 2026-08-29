@main def practicaInventarioColecciones(): Unit =
  var stock = Map("Teclado" -> 5, "Mouse" -> 8, "Monitor" -> 3)
  // updated crea un nuevo Map con el valor asociado a la clave reemplazado.
  stock = stock.updated("Mouse", stock("Mouse") - 2)
  stock.foreach { case (producto, cantidad) => println(s"$producto -> $cantidad unidades") }
