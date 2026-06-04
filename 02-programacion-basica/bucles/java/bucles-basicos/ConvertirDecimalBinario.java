import java.util.Scanner;

public class ConvertirDecimalBinario {
	/*
	 * ESCRIBIR UN PROGRAMA EN JAVA PARA CONVERTIR UN NÚMERO DE BASE DECIMAL A
	 * BINARIO, APLICANDO EL MÉTODO DE DIVISIONES SUCESIVAS.
	 */

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			do {
				System.out.println("Ingrese el numero con base decimal a convertir a binario: ");
				int numberBaseDecimal = teclado.nextInt();

				if (numberBaseDecimal == 0) {
					System.out.println("El numero binario es: 0");
				} else {
					int guardadorBinario = numberBaseDecimal;
					String numberBinario = "";

					while (numberBaseDecimal > 0) {
						int residuo = numberBaseDecimal % 2;

						numberBinario = residuo + numberBinario;
						numberBaseDecimal = numberBaseDecimal / 2;
					}
					System.out.printf("El numero %d (base decimal) convertido a base binario es: %s%n",
							guardadorBinario, numberBinario);

					System.out.println("");
				}
			} while (true);
		}
	}
}
