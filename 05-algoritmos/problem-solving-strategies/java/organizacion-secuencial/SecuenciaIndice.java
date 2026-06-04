import java.util.Arrays;

public class SecuenciaIndice {

	public static void main(String[] args) {

		// Arreglo original (sin ordenar)
		int[] arreglo = { 20, 5, 10, 8, 35, 60, 16, 44, 35 };
		int clave = 35; // Valor que se desea buscar

		// Paso 1: Mostrar los datos iniciales
		System.out.println("=== BÚSQUEDA SECUENCIAL CON ÍNDICES ===\n");
		System.out.println("Arreglo original: " + Arrays.toString(arreglo));
		System.out.println("Clave a buscar: " + clave);

		// Paso 2: Ordenar el arreglo (por convención ascendente)
		Arrays.sort(arreglo);
		System.out.println("\nArreglo ordenado: " + Arrays.toString(arreglo));

		// Paso 3: Definir tamaño de bloque (raíz entera de N)
		int n = arreglo.length;
		int tamBloque = (int) Math.sqrt(n);
		System.out.println("Tamaño del bloque: " + tamBloque);

		// Paso 4: Crear el archivo de índices (último valor de cada bloque)
		int numBloques = (int) Math.ceil((double) n / tamBloque);
		int[] indices = new int[numBloques];
		int pos = 0;

		for (int i = tamBloque - 1; i < n; i += tamBloque) {
			indices[pos++] = arreglo[i];
		}
		if ((n % tamBloque) != 0) {
			indices[pos - 1] = arreglo[n - 1]; // Último bloque incompleto
		}

		System.out.println("\nArchivo de índices: " + Arrays.toString(indices));

		// Paso 5: Búsqueda en el archivo de índices
		int inicio = 0;
		int fin = tamBloque - 1;
		int bloqueEncontrado = -1;
		int iteraciones = 0;

		System.out.println("\n--- Comparación con archivo de índices ---");
		for (int i = 0; i < indices.length; i++) {
			iteraciones++;
			System.out.println("Iteración " + iteraciones + ": índice[" + i + "] = " + indices[i]);
			if (clave <= indices[i]) {
				bloqueEncontrado = i;
				System.out.println("Bloque posible encontrado (B" + (i + 1) + ")");
				break;
			}
		}

		// Paso 6: Búsqueda secuencial dentro del bloque determinado
		boolean encontrado = false;
		if (bloqueEncontrado != -1) {
			inicio = bloqueEncontrado * tamBloque;
			fin = Math.min(inicio + tamBloque - 1, n - 1);

			System.out.println("\n--- Búsqueda secuencial dentro del bloque B" + (bloqueEncontrado + 1) + " ---");
			for (int i = inicio; i <= fin; i++) {
				System.out.println("Comparando clave " + clave + " con " + arreglo[i]);
				if (arreglo[i] == clave) {
					System.out.println("Elemento encontrado en el índice " + i);
					encontrado = true;
					// Se continúa para mostrar si hay valores repetidos
				}
			}
		}

		// Paso 7: Resultados finales
		if (!encontrado) {
			System.out.println("\nClave no encontrada en el arreglo.");
		} else {
			System.out.println("\nBúsqueda completada exitosamente.");
		}

		System.out.println("\nTotal de iteraciones: " + iteraciones);
	}
}
