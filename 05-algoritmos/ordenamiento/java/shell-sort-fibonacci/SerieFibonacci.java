import java.util.Scanner;

public class SerieFibonacci {

	// Calcula el termino n de la serie Fibonacci.
	static int metodoFibonacci(int numero) {

		if (numero < 0) {
			System.out.println("El numero no puede ser negativo");
			return -1;
		} else if (numero == 0) {
			return 0;
		} else if (numero == 1) {
			return 1;
		} else {
			return metodoFibonacci(numero - 1) + metodoFibonacci(numero - 2);
		}
	}

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {

			System.out.println("Implementacion del metodo Fibonacci");

			System.out.print("Ingrese la cantidad de terminos de la serie: ");
			int numeroIngresar = teclado.nextInt();

			for (int i = 0; i < numeroIngresar; i++) {
				System.out.print(metodoFibonacci(i));
				if (i < numeroIngresar - 1) {
					System.out.print(", ");
				}
			}
		}
	}
}
