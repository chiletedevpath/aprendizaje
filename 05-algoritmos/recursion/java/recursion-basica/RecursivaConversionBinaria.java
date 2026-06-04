import java.util.Scanner;

/*
 * REALIZAR MEDIANTE RECURSIVIDAD EL DESARROLLO DE LAS FUNCIONES MATEMÁTICAS Y PROCEDIMIENTO DE CÁLCULO PARA 
 * ALGORITMO PARA HALLAR LA CONVERSIÓN BINARIA, SE DEBE INDICAR LAS RESTRICCIONES, CONDICIONES Y PROCEDIMIENTO
 * DE CÁLCULO MEDIANTE ITERACIÓN DE LOS VALORES INGRESADOS PARA QUE CALCULE EL ALGORITMO.
 * SIENDO LOS TÉRMINOS, Z = NÚMERO ENTERO, BINARIO (Z); PARA LA FUNCIÓN BINARIO (2025).
 * IMPLEMENTAR Y MOSTRAR LOS RESULTADOS DEL ALGORITMO RECURSIVO DE BINARIO EN JAVA.
 */

public class RecursivaConversionBinaria {

	public static String conversionBinariaRecursiva(int z) {

		// CASO BASE:
		if (z == 0) {
			return "";
		}

		// CASO RECURSIVO:
		return conversionBinariaRecursiva(z / 2) + (z % 2);

	}

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("*****************************************");
			System.out.println("**    CONVERSIÓN BINARIA RECURSIVA     **");
			System.out.println("*****************************************\n");

			System.out.print("a) Ingrese el numero entero (z) a convertir en binario: ");
			int z = scanner.nextInt();

			String resultadoBinario = (z == 0) ? "0" : conversionBinariaRecursiva(z);

			System.out.println("\nEl número " + z + " en binario (usando recursividad) es: " + resultadoBinario);
		}
	}
}
