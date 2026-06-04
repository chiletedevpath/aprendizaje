import java.util.Scanner;
/*
 * PIDA AL USUARIO DOS NÚMEROS REALES.
MUESTRE LO SIGUIENTE:
EL MAYOR Y EL MENOR ENTRE AMBOS.
EL NÚMERO 1 ELEVADO AL NÚMERO 2.
LA RAÍZ CUADRADA DE AMBOS NÚMEROS (SI SON POSITIVOS).
EL VALOR ABSOLUTO DE CADA NÚMERO.
EL PROMEDIO REDONDEADO DE AMBOS.
 */

public class UsoClaseMath {

	public static void main(String[] args) {

		double numberOne, numberTwo, numeroMayor, potencia, numeroMenor, promedio;

		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Ingrese el primer numero real: ");
			numberOne = teclado.nextDouble();

			System.out.println("Ingrese el segundo numero real: ");
			numberTwo = teclado.nextDouble();

			numeroMayor = Math.max(numberOne, numberTwo);
			System.out.printf("El numero mayor entre %.2f y %.2f es: %.2f%n", numberOne, numberTwo, numeroMayor);

			numeroMenor = Math.min(numberOne, numberTwo);
			System.out.printf("El numero menor entre %.2f y %.2f es: %.2f%n", numberOne, numberTwo, numeroMenor);

			potencia = Math.pow(numberOne, numberTwo);
			System.out.printf("El numero %.2f elevado al %.2f es %.2f%n", numberOne, numberTwo, potencia);

			if (numberOne > 0) {
				double raizCuadradaOne = Math.sqrt(numberOne);
				System.out.printf("La raiz cuadrada de %.2f es %.2f%n", numberOne, raizCuadradaOne);
			} else {
				System.out.println("No es numero positivo");
			}

			if (numberTwo > 0) {
				double raizCuadradaTwo = Math.sqrt(numberTwo);
				System.out.printf("La raiz cuadrada de %.2f es %.2f%n", numberTwo, raizCuadradaTwo);
			} else {
				System.out.println("No es numero positivo");
			}
			promedio = Math.round(numberOne + numberTwo / 2);
			System.out.printf("El promedio redondeado de %.2f y %.2f es %.2f", numberOne, numberTwo, promedio);
		}
	}
}
