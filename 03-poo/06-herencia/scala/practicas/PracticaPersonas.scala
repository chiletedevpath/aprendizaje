class PersonaBase(val nombre: String)
class Aprendiz(nombre: String) extends PersonaBase(nombre)
@main def practicaPersonas(): Unit = println(new Aprendiz("Ana").nombre)
