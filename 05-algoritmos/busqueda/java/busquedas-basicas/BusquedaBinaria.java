public class BusquedaBinaria {

	// Ordena el arreglo con insercion directa.
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

	// Busca una clave dividiendo el rango de busqueda.
	static int busquedaBinaria(int[] arreglo, int clave, int inicio, int fin) {
		if (inicio > fin) {
			return -1;
		}

		int medio = inicio + (fin - inicio) / 2;

		if (arreglo[medio] == clave) {
			return medio;
		} else if (arreglo[medio] > clave) {
			return busquedaBinaria(arreglo, clave, inicio, medio - 1);
		} else {
			return busquedaBinaria(arreglo, clave, medio + 1, fin);
		}
	}

	public static void main(String[] args) {
		int[] valores = { 19, 14, 12, 22, 9, 25, 8, 27, 5, 28, 7, 33, 4, 37, 17, 2 };

		System.out.println("Ejercicio 02:");
		System.out.println("Ordenamiento por insercion + busqueda binaria\n");

		System.out.print("Arreglo original: ");
		for (int num : valores) {
			System.out.print(num + " ");
		}

		ordenamientoPorInsercion(valores);

		System.out.print("\nArreglo ordenado: ");
		for (int num : valores) {
			System.out.print(num + " ");
		}

		int clave = 22;
		int posicion = busquedaBinaria(valores, clave, 0, valores.length - 1);

		if (posicion != -1) {
			System.out.println("\n\nEl numero " + clave + " se encuentra en la posicion: " + posicion);
		} else {
			System.out.println("\n\nEl numero " + clave + " no se encuentra en el arreglo.");
		}
	}
}
