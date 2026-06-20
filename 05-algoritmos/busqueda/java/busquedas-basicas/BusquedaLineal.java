public class BusquedaLineal {

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

	// Busca la clave recorriendo el arreglo elemento por elemento.
	static int busquedaLineal(int[] arreglo, int clave) {
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == clave) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] valoresEjercicio01 = { 19, 14, 12, 22, 9, 25, 8, 27, 5, 28, 7, 33, 4, 37, 17, 2 };

		System.out.println("Ejercicio 01:");
		System.out.println("Ordenamiento por insercion + busqueda lineal\n");

		System.out.print("Arreglo original: ");
		for (int num : valoresEjercicio01) {
			System.out.print(num + " ");
		}

		ordenamientoPorInsercion(valoresEjercicio01);

		System.out.print("\nArreglo ordenado: ");
		for (int num : valoresEjercicio01) {
			System.out.print(num + " ");
		}

		int clave = 22;
		int posicion = busquedaLineal(valoresEjercicio01, clave);

		if (posicion != -1) {
			System.out.println("\n\nEl numero " + clave + " se encuentra en la posicion: " + posicion);
		} else {
			System.out.println("\n\nEl numero " + clave + " no se encuentra en el arreglo.");
		}
	}
}
