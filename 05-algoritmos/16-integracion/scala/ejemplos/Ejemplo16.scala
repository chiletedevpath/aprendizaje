object Integracion:
  @main def ejecutar():Unit =
    val red=Map("Chilete"->List("Tembladera","Cajamarca"),"Tembladera"->List("Cajamarca"),"Cajamarca"->Nil)
    // La integración combina representación, recorrido y criterios de selección algorítmica.
    println(red)
