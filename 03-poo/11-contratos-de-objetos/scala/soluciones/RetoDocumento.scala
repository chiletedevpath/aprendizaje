case class DocumentoReto(codigo: String)

@main def retoDocumento(): Unit =
  val a = DocumentoReto("X")
  val b = DocumentoReto("X")
  println(a == b)
  println(a)
