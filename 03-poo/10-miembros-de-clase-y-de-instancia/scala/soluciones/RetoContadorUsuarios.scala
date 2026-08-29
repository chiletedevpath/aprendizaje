class UsuarioReto:
  UsuarioReto.incrementar()
object UsuarioReto:
  private var total = 0
  private def incrementar(): Unit = total += 1
  def totalCreados: Int = total

@main def retoContadorUsuarios(): Unit =
  new UsuarioReto; new UsuarioReto; new UsuarioReto
  println(UsuarioReto.totalCreados)
