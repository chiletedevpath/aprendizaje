public class BusquedaBinaria {

	// METODO DE ORDENAMIENTO POR INSERCIÓN
	static void ordenamientoPorInsercion(int[] arreglo) {
		for (int i = 1; i < arreglo.length; i++) {
			int valorActual = arreglo[i];
			int j = i - 1;
			while (j >= 0 && arreglo[j] > valorActual) {
				arreglo[j + 1] = arreglo[j];
				j--;
			}
			arreglo[j + 1] = valorActual;
		}
	}

	// MÉTODO DE BÚSQUEDA BINARIA
	static int busquedaBinaria(int[] arreglo, int clave, int inicio, int fin) {
		if (inicio > fin) {
			return -1; // NO FUE ENCONTRADO
		}

		int medio = inicio + (fin - inicio) / 2;

		if (arreglo[medio] == clave) {
			return medio; // FUE ENCONTRADO
		} else if (arreglo[medio] > clave) {
			return busquedaBinaria(arreglo, clave, inicio, medio - 1);
		} else {
			return busquedaBinaria(arreglo, clave, medio + 1, fin);
		}
	}

	public static void main(String[] args) {
		int[] valores = { 19, 14, 12, 22, 9, 25, 8, 27, 5, 28, 7, 33, 4, 37, 17, 2 };

		System.out.println("EJERCICIO 02:");
		System.out.println("ORDENAMIENTO POR INSERCIÓN + BÚSQUEDA BINARIA\n");

		System.out.print("Arreglo original: ");
		for (int num : valores) {
			System.out.print(num + " ");
		}

		// SE ORDENA EL ARREGLO
		ordenamientoPorInsercion(valores);

		System.out.print("\nArreglo ordenado: ");
		for (int num : valores) {
			System.out.print(num + " ");
		}

		// SE BUSCA EL 22
		int clave = 22;
		int posicion = busquedaBinaria(valores, clave, 0, valores.length - 1);

		// MOSTRAR RESULTADOS
		if (posicion != -1) {
			System.out.println("\n\nEl número " + clave + " se encuentra en la posición: " + posicion);
		} else {
			System.out.println("\n\nEl número " + clave + " NO se encuentra en el arreglo.");
		}
	}
}