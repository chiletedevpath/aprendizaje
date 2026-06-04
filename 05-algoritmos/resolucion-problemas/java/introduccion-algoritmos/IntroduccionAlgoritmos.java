import java.util.Scanner;

public class IntroduccionAlgoritmos {

	// DISEÑAR UN ALGORITMO PARA DETERMINAR SI UN NUMERO ES PRIMO

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			System.out.print("Ingrese el numero: ");
			int numero = teclado.nextInt();

			if (numero <= 1) {
				System.out.println("El numero " + numero + " no es primo");
			} else {
				boolean esPrimo = true;

				for (int i = 2; i <= Math.sqrt(numero); i++) {

					if (numero % i == 0) {
						esPrimo = false;
						break;
					}
				}

				if (esPrimo) {
					System.out.println("\nEl numero " + numero + " si es primo");
				} else {
					System.out.println("\nEl numero " + numero + " no es primo");

				}
			}

		}
	}
}
