import java.util.Arrays;

public class SecuenciaBloques {

	public static void main(String[] args) {

		// Arreglo original (no ordenado)
		int[] arreglo = { 20, 5, 10, 8, 35, 60, 16, 44, 35 };
		int clave = 35; // Valor que se desea buscar

		// Paso 1: Mostrar los datos iniciales
		System.out.println("=== BÚSQUEDA SECUENCIAL POR BLOQUES ===\n");
		System.out.println("Arreglo original: " + Arrays.toString(arreglo));
		System.out.println("Clave a buscar: " + clave);

		// Paso 2: Ordenar el arreglo (por convención ascendente)
		Arrays.sort(arreglo);
		System.out.println("\nArreglo ordenado: " + Arrays.toString(arreglo));

		// Paso 3: Calcular tamaño del bloque (parte entera de raíz de N)
		int n = arreglo.length;
		int tamBloque = (int) Math.sqrt(n);
		System.out.println("Tamaño del bloque: " + tamBloque);

		// Paso 4: Búsqueda por bloques
		int inicio = 0;
		int fin = tamBloque - 1;
		int bloqueEncontrado = -1;
		int iteraciones = 0;

		System.out.println("\n--- Comparación por bloques ---");
		while (inicio < n) {
			iteraciones++;
			int ultimoValor = arreglo[Math.min(fin, n - 1)];
			System.out.println("Iteración " + iteraciones + ": último valor del bloque = " + ultimoValor);

			if (ultimoValor >= clave) {
				bloqueEncontrado = inicio;
				System.out.println("Bloque encontrado en rango [" + inicio + " - " + Math.min(fin, n - 1) + "]");
				break;
			}

			// Avanzar al siguiente bloque
			inicio = fin + 1;
			fin += tamBloque;
		}

		// Paso 5: Búsqueda secuencial dentro del bloque encontrado
		boolean encontrado = false;
		if (bloqueEncontrado != -1) {
			System.out.println("\n--- Búsqueda secuencial dentro del bloque ---");
			for (int i = bloqueEncontrado; i < Math.min(bloqueEncontrado + tamBloque, n); i++) {
				System.out.println("Comparando clave " + clave + " con " + arreglo[i]);
				if (arreglo[i] == clave) {
					System.out.println("Elemento encontrado en el índice " + i);
					encontrado = true;
					// No se detiene si hay valores repetidos
				}
			}
		}

		// Paso 6: Resultados finales
		if (!encontrado) {
			System.out.println("\nClave no encontrada en el arreglo.");
		} else {
			System.out.println("\nBúsqueda completada exitosamente.");
		}

		System.out.println("\nTotal de iteraciones: " + iteraciones);
	}
}
