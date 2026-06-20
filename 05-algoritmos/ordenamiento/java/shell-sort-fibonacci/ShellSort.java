import java.util.Scanner;

public class ShellSort {

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			System.out.println("Implementacion del metodo Shell Sort\n");

			System.out.print("Ingrese la cantidad de numeros a ordenar: ");
			int cantidadNumeros = teclado.nextInt();

			int[] serieNumeros = new int[cantidadNumeros];

			for (int i = 0; i < serieNumeros.length; i++) {
				System.out.print("Ingrese el numero " + (i + 1) + ": ");
				serieNumeros[i] = teclado.nextInt();
			}

			System.out.print("\nLa serie de numeros ingresados a ordenar es: ");
			for (int i = 0; i < serieNumeros.length; i++) {
				System.out.print(serieNumeros[i]);

				if (i < serieNumeros.length - 1) {
					System.out.print(", ");
				}
			}

			metodoShell(serieNumeros);

			System.out.print("\n\nLa serie de numeros ordenados es: ");
			for (int i = 0; i < serieNumeros.length; i++) {
				System.out.print(serieNumeros[i]);
				if (i < serieNumeros.length - 1) {
					System.out.print(", ");
				}
			}
		}
	}

	static void metodoShell(int[] serieIngresada) {
		int tamanoSerie = serieIngresada.length;
		int salto = tamanoSerie / 2;

		while (salto > 0) {
			for (int i = salto; i < tamanoSerie; i++) {
				int valorTemporal = serieIngresada[i];
				int j = i;

				while (j >= salto && serieIngresada[j - salto] > valorTemporal) {
					serieIngresada[j] = serieIngresada[j - salto];
					j -= salto;
				}
				serieIngresada[j] = valorTemporal;
			}
			salto = salto / 2;
		}
	}
}
