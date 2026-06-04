import java.util.Scanner;

public class SerieFibonacci {

	// METODO RECURSIVO PARA CALCULAR EL TERMINO N DE LAS SERIE FIBONACCI
	static int metodoFibonacci(int numero) {

		// DEFINICION DE LA FUNCION
		if (numero < 0) {
			System.out.println("El numero no puede ser negativo");
			return -1;
		} else if (numero == 0) {
			return 0;
		} else if (numero == 1) {
			return 1;
		} else
			// PARTE RECURSIVA: APLICACION DE LA FORMULA GENERAL
			return metodoFibonacci(numero - 1) + metodoFibonacci(numero - 2);
	}

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {

			System.out.println("IMPLEMENTACION DEL METODO FIBONACCI");

			System.out.print("Ingrese la cantidad de términos de la serie:");
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
