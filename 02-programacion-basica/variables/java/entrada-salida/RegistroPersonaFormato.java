import java.util.Scanner;

public class RegistroPersonaFormato {

	/*
	 * ESCRIBE UN PROGRAMA QUE PIDA NOMBRE, EDAD Y ALTURA, Y QUE LOS IMPRIMA
	 * USANDO PRINTF().
	 */

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			String nombre;
			int edad;
			double altura;

			System.out.println("Ingrese su nombre");
			nombre = teclado.nextLine();

			System.out.println("Ingrese su edad");
			edad = teclado.nextInt();

			System.out.println("Ingrese su altura");
			altura = teclado.nextDouble();

			System.out.printf("La persona se llama %s Apellido Ejemplo, tiene %d anios y mide %.2f metros", nombre,
					edad, altura);
		}
	}
}
