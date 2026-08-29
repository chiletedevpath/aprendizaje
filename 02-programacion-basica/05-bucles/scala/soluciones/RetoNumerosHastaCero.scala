import scala.io.StdIn.readLine

@main def retoNumerosHastaCero(): Unit =
  var cantidad = 0
  var suma = 0
  var continuar = true

  // El valor 0 funciona como centinela y no se incluye en los cálculos.
  while continuar do
    val numero = readLine("Número (0 termina): ").toInt
    if numero == 0 then continuar = false
    else
      suma += numero
      cantidad += 1

  val promedio = if cantidad == 0 then 0.0 else suma.toDouble / cantidad
  println(f"Cantidad: $cantidad | Suma: $suma | Promedio: $promedio%.2f")
