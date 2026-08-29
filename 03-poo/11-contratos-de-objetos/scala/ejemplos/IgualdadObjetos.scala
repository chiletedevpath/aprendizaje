case class Documento(codigo: String)

@main def igualdadObjetos(): Unit =
  // case class genera igualdad estructural y representación legible.
  println(Documento("A1") == Documento("A1"))
