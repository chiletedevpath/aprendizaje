import java.util.Scanner;

public class RegistroPersonaFormato {

	/*
	 * ESCRIBE UN PROGRAMA QUE PIDA TU NOMBRE, EDAD Y ALTURA, Y QUE LOS IMPRIMA
	 * USANDO PRINTF()
	 */

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			String name;
			int age;
			double altura;

			System.out.println("Ingrese su nombre");
			name = teclado.nextLine();

			System.out.println("Ingrese su edad");
			age = teclado.nextInt();

			System.out.println("Ingrese su altura");
			altura = teclado.nextDouble();

			System.out.printf("La persona se llama %s Pisco Soto, tiene %d años y mide %.2f metros", name, age, altura);

		}
	}
}
