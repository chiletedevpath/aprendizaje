case class Persona(
  nombres: String,
  apellidos: String,
  edad: Int,
  sexo: String,
  ciudad: String
)

object PersonasLima {
  def main(args: Array[String]): Unit = {
    val personas = Array(
      Persona("Adrian", "Pisco Soto", 28, "Masculino", "Lima"),
      Persona("Maria", "Lopez Diaz", 22, "Femenino", "Lima"),
      Persona("Carlos", "Perez Rojas", 30, "Masculino", "Cajamarca"),
      Persona("Lucia", "Torres Vega", 27, "Femenino", "Lima")
    )

    val apellidos = personas
      .filter(persona => persona.edad > 25 && persona.ciudad.equalsIgnoreCase("Lima"))
      .map(persona => persona.apellidos)

    println("Apellidos de personas mayores de 25 años que viven en Lima:")
    apellidos.foreach(println)
  }
}
