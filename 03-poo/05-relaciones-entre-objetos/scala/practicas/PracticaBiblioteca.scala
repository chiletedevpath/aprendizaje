case class Autor(nombre: String)
case class LibroRelacionado(titulo: String, autor: Autor)
@main def practicaBiblioteca(): Unit = println(LibroRelacionado("POO",Autor("Demo")))
