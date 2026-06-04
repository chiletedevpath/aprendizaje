public class OrdenamientoFusionNatural {

	public static void main(String[] args) {
		int[] arreglo = { 31, 4, 88, 2, 4, 2, 42, 20, 15, 52, 60, 70, 5, 15, 33, 8, 1, 25 };

		System.out.println("Arreglo original:");
		mostrarArreglo(arreglo);

		fusionNatural(arreglo);

		System.out.println("Arreglo ordenado:");
		mostrarArreglo(arreglo);
	}

	// Método principal de Fusión Natural
	public static void fusionNatural(int[] arreglo) {
		int[] aux = new int[arreglo.length];
		boolean ordenado = false;

		while (!ordenado) {
			int inicio = 0;
			int tramo = 0;

			while (inicio < arreglo.length) {
				int fin1 = encontrarTramo(arreglo, inicio);
				int inicio2 = fin1 + 1;

				if (inicio2 >= arreglo.length) {
					ordenado = true;
					break;
				}

				int fin2 = encontrarTramo(arreglo, inicio2);

				mezclarTramos(arreglo, aux, inicio, fin1, inicio2, fin2);

				inicio = fin2 + 1;
				tramo++;
			}

			if (tramo == 0) {
				ordenado = true;
			}
		}
	}

	// Encuentra el final de un tramo ordenado
	public static int encontrarTramo(int[] arreglo, int inicio) {
		while (inicio < arreglo.length - 1 && arreglo[inicio] <= arreglo[inicio + 1]) {
			inicio++;
		}
		return inicio;
	}

	// Mezcla dos tramos ordenados
	public static void mezclarTramos(int[] arreglo, int[] aux, int inicio1, int fin1, int inicio2, int fin2) {
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

		for (int l = inicio1; l <= fin2; l++) {
			arreglo[l] = aux[l];
		}
	}

	// Muestra el arreglo en consola
	public static void mostrarArreglo(int[] arreglo) {
		for (int valor : arreglo) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
}
