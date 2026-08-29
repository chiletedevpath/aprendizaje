import java.util.Scanner;

public class SumarNumerosHastaCero {

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			int numero = -1;
			int suma = 0;
			int contador = 0;

			// Usa 0 como valor centinela para finalizar la lectura de datos.
			while (numero != 0) {
				System.out.print("Ingrese un numero (con el 0 se finaliza): ");
				numero = teclado.nextInt();
				suma += numero;
				if (numero != 0) {
					contador++;
				}
			}
			System.out.println("La suma de los numeros ingresados es: " + suma);
			System.out.println("La cantidad de los numeros ingresados es: " + contador);
		}
	}
}
