public class OrdenamientoMezclaDirecta {

	// Función principal
	public static void main(String[] args) {
		int[] arreglo = { 31, 4, 88, 2, 4, 2, 42 };

		System.out.println("Arreglo original:");
		imprimirArreglo(arreglo);

		MezclaDirecta(arreglo, 0, arreglo.length - 1);

		System.out.println("Arreglo ordenado:");
		imprimirArreglo(arreglo);
	}

	// Función que divide el arreglo y llama a la mezcla
	public static void MezclaDirecta(int[] arreglo, int izquierda, int derecha) {
		if (izquierda < derecha) {
			int medio = (izquierda + derecha) / 2;

			// Dividir en dos mitades
			MezclaDirecta(arreglo, izquierda, medio);
			MezclaDirecta(arreglo, medio + 1, derecha);

			// Mezclar las mitades
			mezclar(arreglo, izquierda, medio, derecha);
		}
	}

	// Función que mezcla dos mitades ordenadas
	public static void mezclar(int[] arreglo, int izquierda, int medio, int derecha) {
		int n1 = medio - izquierda + 1;
		int n2 = derecha - medio;

		// Crear arreglos temporales
		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copiar datos a los arreglos temporales
		for (int i = 0; i < n1; i++)
			L[i] = arreglo[izquierda + i];
		for (int j = 0; j < n2; j++)
			R[j] = arreglo[medio + 1 + j];

		// Mezclar los arreglos
		int i = 0, j = 0, k = izquierda;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arreglo[k] = L[i];
				i++;
			} else {
				arreglo[k] = R[j];
				j++;
			}
			k++;
		}

		// Copiar elementos restantes
		while (i < n1) {
			arreglo[k] = L[i];
			i++;
		}
		while (j < n2) {
			arreglo[k] = R[j];
			j++;
			k++;
		}
	}

	// Función para imprimir el arreglo
	public static void imprimirArreglo(int[] arreglo) {
		for (int valor : arreglo) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
}