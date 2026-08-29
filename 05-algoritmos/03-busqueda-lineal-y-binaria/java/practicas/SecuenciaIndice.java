import java.util.Arrays;

public class SecuenciaIndice {

	public static int buscar(int[] arreglo, int clave) {
		if (arreglo.length == 0) {
			return -1;
		}

		int tamanoBloque = Math.max(1, (int) Math.sqrt(arreglo.length));
		int numeroBloques = (arreglo.length + tamanoBloque - 1) / tamanoBloque;
		int[] indices = new int[numeroBloques];

		for (int i = 0; i < numeroBloques; i++) {
			int finBloque = Math.min((i + 1) * tamanoBloque - 1, arreglo.length - 1);
			indices[i] = arreglo[finBloque];
		}

		for (int bloque = 0; bloque < indices.length; bloque++) {
			if (clave <= indices[bloque]) {
				int inicio = bloque * tamanoBloque;
				int fin = Math.min(inicio + tamanoBloque, arreglo.length);
				for (int i = inicio; i < fin; i++) {
					if (arreglo[i] == clave) {
						return i;
					}
				}
				return -1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arreglo = { 20, 5, 10, 8, 35, 60, 16, 44, 35 };
		int clave = 35;

		System.out.println("=== Busqueda secuencial con indices ===\n");
		System.out.println("Arreglo original: " + Arrays.toString(arreglo));
		System.out.println("Clave a buscar: " + clave);

		Arrays.sort(arreglo);
		System.out.println("\nArreglo ordenado: " + Arrays.toString(arreglo));

		int posicion = buscar(arreglo, clave);
		System.out.println(posicion >= 0
				? "\nClave encontrada en el indice " + posicion
				: "\nClave no encontrada en el arreglo.");
	}
}
