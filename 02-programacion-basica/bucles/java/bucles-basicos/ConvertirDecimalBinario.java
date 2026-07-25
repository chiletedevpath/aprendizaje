import java.util.Scanner;

public class ConvertirDecimalBinario {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.print("Ingrese un número decimal no negativo: ");
			int numeroDecimal = teclado.nextInt();

			if (numeroDecimal < 0) {
				System.out.println("El número debe ser mayor o igual que cero.");
				return;
			}

			if (numeroDecimal == 0) {
				System.out.println("El número binario es: 0");
				return;
			}

			int cociente = numeroDecimal;
			String numeroBinario = "";

			while (cociente > 0) {
				int residuo = cociente % 2;
				numeroBinario = residuo + numeroBinario;
				cociente /= 2;
			}

			System.out.printf("%d en binario es %s.%n", numeroDecimal, numeroBinario);
		}
	}
}
