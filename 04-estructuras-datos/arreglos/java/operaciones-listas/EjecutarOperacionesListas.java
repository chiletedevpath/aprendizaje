import java.util.ArrayList;
import java.util.List;

public class EjecutarOperacionesListas {

	public static void main(String[] args) {

		// Crea una lista de cursos y agrega elementos con add.
		List<String> cursos = new ArrayList<>();
		cursos.add("Programacion orientada a objetos");
		cursos.add("Estructuras de datos");
		cursos.add("Chilete DevPath Labs");
		System.out.println("1) " + cursos);

		// Crea una lista de dias para practicar operaciones por indice.
		List<String> dias = new ArrayList<>();
		dias.add("Lunes");
		dias.add("Martes");
		dias.add("Miercoles");
		dias.add("Jueves");
		dias.add("Viernes");
		dias.add("Sabado");
		System.out.println("2) " + dias);

		// Reemplaza el elemento ubicado en la posicion 2.
		dias.set(2, "Base de Datos");
		System.out.println("3) " + dias);

		// Elimina el elemento de la posicion 2.
		dias.remove(2);
		System.out.println("4) " + dias);

		// Inserta un nuevo valor y actualiza otro elemento de la lista.
		dias.add(2, "Miercoles");
		dias.set(3, "Practica Chilete DevPath");
		dias.remove("Sabado");
		System.out.println("5) " + dias);
	}
}
