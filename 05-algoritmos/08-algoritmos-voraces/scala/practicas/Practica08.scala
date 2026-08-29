object Practica08:
  @main def ejecutar():Unit =
    var monto=87
    val monedas=List(50,20,10,5,2,1)
    for moneda <- monedas do
      val cantidad=monto/moneda
      if cantidad>0 then println(s"$moneda -> $cantidad")
      monto%=moneda
