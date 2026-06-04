import java.util.ArrayList;
import java.util.List;

public class EjercicioConListas {

	public static void main(String[] args) {

		// 1) Crear lista con cursos: add para agregar
		List<String> cursos = new ArrayList<>();
		cursos.add("Programacion orientada a objetos");
		cursos.add("base de datos");
		cursos.add("redes de datos");
		System.out.println("1) " + cursos);

		List<String> meses = new ArrayList<>();
		meses.add("Enero");
		meses.add("febrero");
		meses.add("marzo");
		meses.add("abril");
		meses.add("mayo");
		meses.add("junio");
		System.out.println("2) " + meses);

		// 3) uso del set: reemplaza el elemento en la posicion indicada.
		meses.set(2, "inteligencia de negocios");
		System.out.println("3) " + meses);

		// 4) uso del remove: eliminar el elemento segun su indice
		meses.remove(2);
		System.out.println("4) " + meses);

		// 5) uso del set para cambiar abril por xxxx
		meses.set(2, "xxxx");
		System.out.println("5) " + meses);
	}
}

