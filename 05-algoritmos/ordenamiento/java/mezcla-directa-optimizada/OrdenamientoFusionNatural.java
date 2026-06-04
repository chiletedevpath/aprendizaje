public class OrdenamientoFusionNatural {

	public static void main(String[] args) {
		int[] datos = { 14, 27, 33, 5, 8, 11, 23, 44, 22, 31, 46, 7, 8, 11, 1, 99, 23, 40, 6, 11, 14 };

		System.out.println("Datos originales:");
		imprimir(datos);

		fusionNatural(datos);

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

	// Función principal de Fusión Natural
	public static void fusionNatural(int[] arreglo) {
		int[] aux = new int[arreglo.length];
		boolean ordenado = false;

		while (!ordenado) {
			ordenado = true;
			int inicio = 0;

			while (inicio < arreglo.length) {
				int fin1 = encontrarFinSublista(arreglo, inicio);
				int inicio2 = fin1 + 1;

				if (inicio2 >= arreglo.length)
					break;

				int fin2 = encontrarFinSublista(arreglo, inicio2);

				mezclar(arreglo, aux, inicio, fin1, inicio2, fin2);

				inicio = fin2 + 1;
				ordenado = false;
			}
		}
	}

	// Detecta el fin de una sublista ordenada
	public static int encontrarFinSublista(int[] arreglo, int inicio) {
		while (inicio < arreglo.length - 1 && arreglo[inicio] <= arreglo[inicio + 1]) {
			inicio++;
		}
		return inicio;
	}

	// Mezcla dos sublistas ordenadas
	public static void mezclar(int[] arreglo, int[] aux, int inicio1, int fin1, int inicio2, int fin2) {
		int i = inicio1;
		int j = inicio2;
		int k = inicio1;

		while (i <= fin1 && j <= fin2) {
			if (arreglo[i] <= arreglo[j]) {
				aux[k++] = arreglo[i++];
			} else {
				aux[k++] = arreglo[j++];
			}
		}

		while (i <= fin1) {
			aux[k++] = arreglo[i++];
		}

		while (j <= fin2) {
			aux[k++] = arreglo[j++];
		}

		for (int m = inicio1; m <= fin2; m++) {
			arreglo[m] = aux[m];
		}
	}
}
