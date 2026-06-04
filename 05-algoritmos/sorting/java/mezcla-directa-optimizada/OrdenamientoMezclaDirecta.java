import java.util.Arrays;

public class OrdenamientoMezclaDirecta {

	public static void main(String[] args) {
		
		int[] datos = { 14, 27, 33, 5, 8, 11, 23, 44, 22, 31, 46, 7, 8, 11, 1, 99, 23, 40, 6, 11, 14, 17 };

		System.out.println("Datos originales:");
		imprimir(datos);

		mezclaDirecta(datos);

		System.out.println("\nDatos ordenados:");
		imprimir(datos);
	}

	// Función para imprimir el arreglo
	public static void imprimir(int[] arreglo) {
		
		for (int num : arreglo) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	// Función de mezcla directa
	public static void mezclaDirecta(int[] arreglo) {
		
		if (arreglo.length <= 1)
			return;

		int medio = arreglo.length / 2;

		int[] izquierda = Arrays.copyOfRange(arreglo, 0, medio);
		
		int[] derecha = Arrays.copyOfRange(arreglo, medio, arreglo.length);

		mezclaDirecta(izquierda);
		
		mezclaDirecta(derecha);

		fusionar(arreglo, izquierda, derecha);
	}

	// Función para fusionar dos subarreglos ordenados
	public static void fusionar(int[] arreglo, int[] izquierda, int[] derecha) {
	
		int i = 0, j = 0, k = 0;

		while (i < izquierda.length && j < derecha.length) {
		
			if (izquierda[i] <= derecha[j]) {
				arreglo[k++] = izquierda[i++];
			} else {
				arreglo[k++] = derecha[j++];
			}
		}

		while (i < izquierda.length) {
			arreglo[k++] = izquierda[i++];
		}

		while (j < derecha.length) {
			arreglo[k++] = derecha[j++];
		}
	}
}
