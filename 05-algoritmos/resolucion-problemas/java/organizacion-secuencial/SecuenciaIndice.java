import java.util.Arrays;

public class SecuenciaIndice {

	public static void main(String[] args) {

		int[] arreglo = { 20, 5, 10, 8, 35, 60, 16, 44, 35 };
		int clave = 35;

		System.out.println("=== Busqueda secuencial con indices ===\n");
		System.out.println("Arreglo original: " + Arrays.toString(arreglo));
		System.out.println("Clave a buscar: " + clave);

		Arrays.sort(arreglo);
		System.out.println("\nArreglo ordenado: " + Arrays.toString(arreglo));

		int n = arreglo.length;
		int tamBloque = (int) Math.sqrt(n);
		System.out.println("Tamano del bloque: " + tamBloque);

		int numBloques = (int) Math.ceil((double) n / tamBloque);
		int[] indices = new int[numBloques];

		for (int i = 0; i < numBloques; i++) {
			int finBloque = Math.min((i + 1) * tamBloque - 1, n - 1);
			indices[i] = arreglo[finBloque];
		}

		System.out.println("\nArchivo de indices: " + Arrays.toString(indices));

		int inicio = 0;
		int fin = tamBloque - 1;
		int bloqueEncontrado = -1;
		int iteraciones = 0;

		System.out.println("\n--- Comparacion con archivo de indices ---");
		for (int i = 0; i < indices.length; i++) {
			iteraciones++;
			System.out.println("Iteracion " + iteraciones + ": indice[" + i + "] = " + indices[i]);
			if (clave <= indices[i]) {
				bloqueEncontrado = i;
				System.out.println("Bloque posible encontrado (B" + (i + 1) + ")");
				break;
			}
		}

		boolean encontrado = false;
		if (bloqueEncontrado != -1) {
			inicio = bloqueEncontrado * tamBloque;
			fin = Math.min(inicio + tamBloque - 1, n - 1);

			System.out.println("\n--- Busqueda secuencial dentro del bloque B" + (bloqueEncontrado + 1) + " ---");
			for (int i = inicio; i <= fin; i++) {
				System.out.println("Comparando clave " + clave + " con " + arreglo[i]);
				if (arreglo[i] == clave) {
					System.out.println("Elemento encontrado en el indice " + i);
					encontrado = true;
				}
			}
		}

		if (!encontrado) {
			System.out.println("\nClave no encontrada en el arreglo.");
		} else {
			System.out.println("\nBusqueda completada exitosamente.");
		}

		System.out.println("\nTotal de iteraciones: " + iteraciones);
	}
}
