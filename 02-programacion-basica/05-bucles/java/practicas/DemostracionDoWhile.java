import java.util.Scanner;

public class DemostracionDoWhile {

	public static void main(String[] args) {
		// Scanner conecta el programa con la entrada estándar (teclado).
		try (Scanner lector = new Scanner(System.in)) {
			int opcion;
			String menu = "|===================================|%n"
					+ "| Acciones disponibles             |%n"
					+ "| [1] Agregar notas                 |%n"
					+ "| [2] Ver promedio                  |%n"
					+ "| [3] Salir                         |%n"
					+ "|===================================|%n"
					+ "Ingrese una opción: ";

			do {
				System.out.printf(menu);
				opcion = lector.nextInt();

				switch (opcion) {
				case 1 -> System.out.println("Seleccionó agregar notas.\n");
				case 2 -> System.out.println("Seleccionó ver el promedio.\n");
				case 3 -> System.out.println("Programa finalizado.");
				default -> System.out.println("Opción inválida. Intente nuevamente.\n");
				}
			} while (opcion != 3);
		}
	}
}
