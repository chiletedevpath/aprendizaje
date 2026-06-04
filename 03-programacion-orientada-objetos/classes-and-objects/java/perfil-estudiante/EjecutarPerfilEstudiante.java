import java.util.ArrayList;

public class EjecutarPerfilEstudiante {

	public static void main(String[] args) {

		// CREO UNA LISTA LLAMADA PERSONA1 QUE ALMACENARA OBJETOS DE TIPO PERSONA
		ArrayList<Persona> persona1 = new ArrayList<>();

		// AGREGO MIS DATOS
		persona1.add(new Persona("Adrian Ivan", "Pisco Soto", 27, "IV", "Ingenieria de Sistemas e Informatica"));

		// IMPRIMO MIS DATOS
		for (Persona pers : persona1) {
			System.out.println(pers.toString());
		}
	}
}

