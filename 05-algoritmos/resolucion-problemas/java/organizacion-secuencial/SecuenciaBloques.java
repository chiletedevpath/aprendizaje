import java.util.Arrays;

public class SecuenciaBloques {

	public static void main(String[] args) {

		int[] arreglo = { 20, 5, 10, 8, 35, 60, 16, 44, 35 };
		int clave = 35;

		System.out.println("=== Busqueda secuencial por bloques ===\n");
		System.out.println("Arreglo original: " + Arrays.toString(arreglo));
		System.out.println("Clave a buscar: " + clave);

		Arrays.sort(arreglo);
		System.out.println("\nArreglo ordenado: " + Arrays.toString(arreglo));

		int n = arreglo.length;
		int tamBloque = (int) Math.sqrt(n);
		System.out.println("Tamano del bloque: " + tamBloque);

		int inicio = 0;
		int fin = tamBloque - 1;
		int bloqueEncontrado = -1;
		int iteraciones = 0;

		System.out.println("\n--- Comparacion por bloques ---");
		while (inicio < n) {
			iteraciones++;
			int ultimoValor = arreglo[Math.min(fin, n - 1)];
			System.out.println("Iteracion " + iteraciones + ": ultimo valor del bloque = " + ultimoValor);

			if (ultimoValor >= clave) {
				bloqueEncontrado = inicio;
				System.out.println("Bloque encontrado en rango [" + inicio + " - " + Math.min(fin, n - 1) + "]");
				break;
			}

			inicio = fin + 1;
			fin += tamBloque;
		}

		boolean encontrado = false;
		if (bloqueEncontrado != -1) {
			System.out.println("\n--- Busqueda secuencial dentro del bloque ---");
			for (int i = bloqueEncontrado; i < Math.min(bloqueEncontrado + tamBloque, n); i++) {
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
