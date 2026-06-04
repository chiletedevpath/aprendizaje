import java.util.Scanner;

/*
 * REALIZAR MEDIANTE RECURSIVIDAD EL DESARROLLO DE LAS FUNCIONES MATEMÁTICAS Y PROCEDIMIENTO DE CÁLCULO
 * PARA ALGORITMO PARA HALLAR LA POTENCIA, SE DEBE INDICAR LAS RESTRICCIONES, CONDICIONES Y PROCEDIMIENTO
 * DE CÁLCULO MEDIANTE ITERACIÓN DE LOS VALORES INGRESADOS PARA QUE CALCULE EL ALGORITMO.
 * SIENDO LOS TÉRMINOS, X = BASE, Y = EXPONENTE, POTENCIA(X, Y); PARA LA FUNCIÓN POTENCIA(-4, 6)
 * IMPLEMENTAR Y MOSTRAR LOS RESULTADOS DEL ALGORITMO RECURSIVO DE POTENCIA EN JAVA.
 */

public class RecursivaDePotencia {

	public static double metodoPotenciaRecursiva(double x, double y) {

		// CASO BASE:
		if (y == 0) {
			return 1;
		}

		// CASO RECURSIVO POSITIVO:
		if (y > 0) {
			return x * metodoPotenciaRecursiva(x, y - 1);
		}

		// CASO RECURSIVO NEGATIVO:
		return 1.0 / metodoPotenciaRecursiva(x, -y);
	}

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("*****************************************");
			System.out.println("**       RECURSIVIDAD EN POTENCIA      **");
			System.out.println("*****************************************\n");

			System.out.print("a) Ingrese el valor de x (base): ");
			double x = scanner.nextDouble();

			System.out.print("\nb)Ingrese el valor de y (exponente): ");
			double y = scanner.nextDouble();

			double resultadoPotenciaRecursiva = metodoPotenciaRecursiva(x, y);

			System.out.printf("\nLa potencia de " + x + " elevado a " + y + " usando recursividad es: "
					+ resultadoPotenciaRecursiva);
		}
	}
}
