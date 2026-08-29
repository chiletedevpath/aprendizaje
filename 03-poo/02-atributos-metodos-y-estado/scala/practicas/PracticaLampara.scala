class Lampara:
  private var encendida = false
  def cambiarEstado(): Unit = encendida = !encendida
  def estado: Boolean = encendida
@main def practicaLampara(): Unit = { val l=new Lampara; l.cambiarEstado(); println(l.estado) }
