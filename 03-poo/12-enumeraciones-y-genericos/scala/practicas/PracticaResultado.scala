enum Estado:
  case Pendiente, Completado
case class Resultado[T](valor: T, estado: Estado)
@main def practicaResultado(): Unit = println(Resultado(20,Estado.Completado))
