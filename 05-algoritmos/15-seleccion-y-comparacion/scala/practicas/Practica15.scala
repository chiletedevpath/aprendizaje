object Practica15:
  @main def ejecutar():Unit =
    val datos=(0 until 100000).toArray
    val inicio=System.nanoTime()
    val pos=java.util.Arrays.binarySearch(datos,99999)
    val duracion=System.nanoTime()-inicio
    println(s"pos=$pos, ns=$duracion")
    // Una medición aislada complementa, pero no reemplaza, el análisis de complejidad.
