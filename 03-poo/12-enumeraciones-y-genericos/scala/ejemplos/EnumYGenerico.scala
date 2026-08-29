enum Nivel:
  case Basico, Intermedio, Avanzado
class Caja[T](val valor: T)

@main def enumYGenerico(): Unit = println(new Caja(Nivel.Basico).valor)
