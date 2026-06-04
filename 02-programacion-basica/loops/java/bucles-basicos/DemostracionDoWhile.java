import java.util.Scanner;

public class DemostracionDoWhile {

	public static void main(String[] args) {

		/*
		 * int numero; Scanner lector = new Scanner(System.in);
		 * 
		 * do { System.out.print("Ingrese un valor entre 0 y 10: "); numero =
		 * lector.nextInt(); lector.nextLine(); } while (numero < 0 || numero > 10);
		 * System.out.println("Usted ingresó: " + numero);
		 * 
		 * lector.close();
		 */
		Scanner lector = new Scanner(System.in);
		int opcion = 0;
		String menu = """
				|===================================|
				| Acciones disponibles: |
				| [1] Agregar notas |
				| [2] Ver promedio |
				| [3] Salir |
				|===================================|
				Ingrese una opción: """;
		do {
			System.out.println(menu);
			opcion = lector.nextInt();
			lector.nextLine();
		} while (opcion != 3);
		lector.close();
	}
}
