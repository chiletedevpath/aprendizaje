import java.util.Arrays;
import java.util.Scanner;

public class CopiarArreglos {

	// System.arraycopy
	/******************************************************************************
	 * CONCEPTO: ES UN MÉTODO NATIVO DE JAVA QUE COPIA UNA PARTE o TOD0 UN ARREGLO
	 * (ARRAY) A OTRO ARREGLO, SIN TENER QUE USAR BUCLES MANUALES. FORMA PARTE DE LA
	 * CLASE SYSTEM.
	 ******************************************************************************
	 * EJERCICIO: CREAR UN NUEVO ARREGLO LLAMADO FUSIONADO QUE CONTENGA TODOS LOS
	 * ELEMENTOS DE A SEGUIDOS POR TODOS LOS ELEMENTOS DE B. USA SOLO
	 * SYSTEM.ARRAYCOPY() PARA HACER LA COPIA. LUEGO, IMPRIME EL CONTENIDO DEL
	 * ARREGLO FUSIONADO.
	 * 
	 * SINTAXIS: System.arraycopy(ORIGEN, INICIO_ORIGEN, DESTINO, INICIO_DESTINO,
	 * CANTIDAD)
	 * 
	 */

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			int[] a = new int[5];
			int[] b = new int[8];
			int[] fusionado = new int[a.length + b.length];

			for (int i = 0; i < a.length; i++) {
				System.out.printf("Ingrese valor %d del arreglo A: ", (i + 1));
				a[i] = teclado.nextInt();
			}
			System.out.println("\n-----------------------------\n");
			System.out.println("Arreglo A: " + Arrays.toString(a)); // IMPRIME EL ARREGLO
			System.out.println("\n-----------------------------\n");

			for (int j = 0; j < b.length; j++) {
				System.out.printf("Ingrese valor %d del arreglo B: ", (j + 1));
				b[j] = teclado.nextInt();
			}
			System.out.println("\n-----------------------------\n");
			System.out.println("Arreglo B: " + Arrays.toString(b));
			System.out.println("\n-----------------------------\n");

			System.arraycopy(a, 0, fusionado, 0, a.length);
			System.arraycopy(b, 0, fusionado, a.length, b.length);

			System.out.println("La fusion de los arreglos A y B es: " + Arrays.toString(fusionado));
		}
	}
}
