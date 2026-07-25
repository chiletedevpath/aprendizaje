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

	static int buscar(int[] arreglo, int clave) {
		return buscarEnRango(arreglo, clave, 0, arreglo.length - 1);
	}

	private static int buscarEnRango(int[] arreglo, int clave, int inicio, int fin) {
		if (inicio > fin) {
			return -1;
		}

		int medio = inicio + (fin - inicio) / 2;

		if (arreglo[medio] == clave) {
			return medio;
		} else if (arreglo[medio] > clave) {
			return buscarEnRango(arreglo, clave, inicio, medio - 1);
		} else {
			return buscarEnRango(arreglo, clave, medio + 1, fin);
		}
	}

	public static void main(String[] args) {
		int[] valores = { 19, 14, 12, 22, 9, 25, 8, 27, 5, 28, 7, 33, 4, 37, 17, 2 };

		System.out.println("Ejercicio 02:");
		System.out.println("Busqueda binaria: requiere datos ordenados\n");

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
		int posicion = buscar(valores, clave);

		if (posicion != -1) {
			System.out.println("\n\nEl numero " + clave + " se encuentra en la posicion: " + posicion);
		} else {
			System.out.println("\n\nEl numero " + clave + " no se encuentra en el arreglo.");
		}
	}
}
