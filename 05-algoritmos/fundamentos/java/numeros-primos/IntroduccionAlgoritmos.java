import java.util.Scanner;

public class IntroduccionAlgoritmos {

	public static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}

		for (int divisor = 2; divisor <= numero / divisor; divisor++) {
			if (numero % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.print("Ingrese el numero: ");
			int numero = teclado.nextInt();

			String resultado = esPrimo(numero) ? " es primo" : " no es primo";
			System.out.println("El numero " + numero + resultado);
		}
	}
}
