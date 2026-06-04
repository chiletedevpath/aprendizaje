import java.util.ArrayList;
import java.util.List;

public class EjecutarOperacionesListas {

	public static void main(String[] args) {

		// CREO LA LISTA DE LOS CURSOS Y USO ADD
		List<String> cursos = new ArrayList<>();
		cursos.add("Programacion orientada a objetos");
		cursos.add("IA");
		cursos.add("ITIL");
		System.out.println("1) " + cursos);

		// CREO LA LISTA DE LOS DIAS Y USO ADD
		List<String> dias = new ArrayList<>();
		dias.add("Lunes");
		dias.add("Martes");
		dias.add("Miercoles");
		dias.add("Jueves");
		dias.add("Viernes");
		dias.add("Sabado");
		System.out.println("2) " + dias);

		// UTILIZO SET PARA CAMBIAR MIERCOLES POR BASE DE DATOS
		dias.set(2, "Base de Datos");
		System.out.println("3) " + dias);

		// USO REMOVE PARA ELIMINAR BASE DE DATOS
		dias.remove(2);
		System.out.println("4) " + dias);

		// AGREGO MIERCOLES EN POSICION 2 Y USO SET PARA CAMBIAR JUEVES POR XXXXXX
		dias.add(2, "Miercoles");
		dias.set(3, "xxxxxx");
		dias.remove("Sabado");
		System.out.println("5) " + dias);
	}
}
