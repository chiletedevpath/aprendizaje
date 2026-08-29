import scala.util.{Failure, Success, Try}

@main def ejemploTry(): Unit =
  // Try captura una operación que puede lanzar una excepción.
  Try("abc".toInt) match
    case Success(numero) => println(numero)
    case Failure(_) => println("Entrada no numérica")
