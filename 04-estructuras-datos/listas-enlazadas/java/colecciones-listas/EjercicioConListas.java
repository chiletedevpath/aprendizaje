import java.util.ArrayList;
import java.util.List;

public class EjercicioConListas {

	public static void main(String[] args) {

		// Crea una lista de cursos y agrega elementos con add.
		List<String> cursos = new ArrayList<>();
		cursos.add("Programacion orientada a objetos");
		cursos.add("Base de datos");
		cursos.add("Chilete DevPath Labs");
		System.out.println("1) " + cursos);

		List<String> meses = new ArrayList<>();
		meses.add("Enero");
		meses.add("febrero");
		meses.add("marzo");
		meses.add("abril");
		meses.add("mayo");
		meses.add("junio");
		System.out.println("2) " + meses);

		// Reemplaza el elemento en la posicion indicada.
		meses.set(2, "inteligencia de negocios");
		System.out.println("3) " + meses);

		// Elimina el elemento segun su indice.
		meses.remove(2);
		System.out.println("4) " + meses);

		// Actualiza un elemento para mostrar el cambio en la lista.
		meses.set(2, "Practica Chilete DevPath");
		System.out.println("5) " + meses);
	}
}
