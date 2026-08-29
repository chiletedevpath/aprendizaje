import scala.util.Try

def dividirSeguro(a: Double, b: Double): Either[String, Double] =
  if b == 0 then Left("No se puede dividir entre cero")
  else Right(a / b)

@main def practicaDivisionSegura(): Unit =
  // Either representa explícitamente un error o un resultado correcto.
  dividirSeguro(10, 2) match
    case Right(valor) => println(valor)
    case Left(error) => println(error)
