public class BusquedaLineal {

	// METODO DE ORDENAMIENTO POR INSERCIÓN
	static void ordenamientoPorInsercion(int[] arreglo) {
		// RECORREMOS EL ARREGLO DESDE LA SEGUNDA POSICIÓN (i = 1)
		for (int i = 1; i < arreglo.length; i++) {
			int valorActual = arreglo[i];
			int j = i - 1;

			// COMPARAMOS HACIA ATRÁS Y MOVEMOS LOS ELEMENTOS MAYORES UNA POSICIÓN ADELANTE
			while (j >= 0 && arreglo[j] > valorActual) {
				arreglo[j + 1] = arreglo[j];
				j--;
			}
			arreglo[j + 1] = valorActual;
		}
	}

	// MÉTODO DE BÚSQUEDA LINEAL
	static int busquedaLineal(int[] arreglo, int clave) {
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == clave) {
				return i; // DEVOLVER LA POSICION DONDE SE ENCONTRO
			}
		}
		return -1; // -1 INDICA QUE NO SE ENCONTRO
	}

	public static void main(String[] args) {
		int[] valoresEjercicio01 = { 19, 14, 12, 22, 9, 25, 8, 27, 5, 28, 7, 33, 4, 37, 17, 2 };

		System.out.println("EJERCICIO 01:");
		System.out.println("ORDENAMIENTO POR INSERCIÓN + BÚSQUEDA LINEAL\n");

		System.out.print("Arreglo original: ");
		for (int num : valoresEjercicio01) {
			System.out.print(num + " ");
		}

		// PASO 1: ORDENAR EL ARREGLO
		ordenamientoPorInsercion(valoresEjercicio01);

		System.out.print("\nArreglo ordenado: ");
		for (int num : valoresEjercicio01) {
			System.out.print(num + " ");
		}

		// PASO 2: BUSCAR EL NUMERO
		int clave = 22;
		int posicion = busquedaLineal(valoresEjercicio01, clave);

		// PASO 03: MOSTRAR EL RESULTADO
		if (posicion != -1) {
			System.out.println("\n\nEl número " + clave + " se encuentra en la posición: " + posicion);
		} else {
			System.out.println("\n\nEl número " + clave + " NO se encuentra en el arreglo.");
		}
	}
}