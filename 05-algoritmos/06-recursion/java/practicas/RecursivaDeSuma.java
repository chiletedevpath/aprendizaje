import java.util.Scanner;

public class RecursivaDeSuma {

	/*
	 * REALIZAR MEDIANTE RECURSIVIDAD EL DESARROLLO DE LAS FUNCIONES MATEMÁTICAS Y
	 * PROCEDIMIENTO DE CÁLCULO PARA ALGORITMO PARA HALLAR LA SUMA, SE DEBE INDICAR
	 * LAS RESTRICCIONES, CONDICIONES Y PROCEDIMIENTO DE CÁLCULO MEDIANTE ITERACIÓN
	 * DE LOS VALORES INGRESADOS PARA QUE CALCULE EL ALGORITMO. SIENDO LOS TÉRMINOS,
	 * X = PRIMER DIGITO, Y = SEGUNDO DIGITO, SUMA(X, Y); PARA LA FUNCIÓN SUMA(-4,
	 * 6) IMPLEMENTAR Y MOSTRAR LOS RESULTADOS DEL ALGORITMO RECURSIVO DE SUMA EN
	 * JAVA.
	 * 
	 */

	public static int metodoSumaRecursiva(int x, int y) {

		// CASO BASE:
		if (y == 0) {
			return x;
		}

		// CASO RECURSIVO POSITIVO:
		if (y > 0) {
			return metodoSumaRecursiva(x + 1, y - 1); 
		}

		// CASO RECURSIVO NEGATIVO:
		return metodoSumaRecursiva(x - 1, y + 1);
	}

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("*****************************************");
			System.out.println("**        RECURSIVIDAD EN SUMA         **");
			System.out.println("*****************************************\n");

			System.out.print("a) Ingrese el valor de x: ");
			int x = scanner.nextInt();

			System.out.print("\nb)Ingrese el valor de y: ");
			int y = scanner.nextInt();

			int resultadoSumaRecursiva = metodoSumaRecursiva(x, y);

			System.out.println("\nLa suma de " + x + " + " + y + " usando recursividad es: " + resultadoSumaRecursiva);
		}
	}
}
