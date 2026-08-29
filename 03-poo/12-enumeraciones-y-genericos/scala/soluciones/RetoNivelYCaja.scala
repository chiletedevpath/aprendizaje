enum NivelCurso:
  case Basico, Intermedio, Avanzado
class CajaReto[T]:
  private var valor: Option[T] = None
  def guardar(v: T): Unit = valor = Some(v)
  def obtener: Option[T] = valor

@main def retoNivelYCaja(): Unit =
  val caja = new CajaReto[String]
  caja.guardar("Recurso POO")
  println(s"${NivelCurso.Intermedio} - ${caja.obtener}")
