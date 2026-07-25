import java.util.Arrays;

public class SecuenciaBloques {

	public static int buscar(int[] arreglo, int clave) {
		if (arreglo.length == 0) {
			return -1;
		}

		int tamanoBloque = Math.max(1, (int) Math.sqrt(arreglo.length));
		int inicio = 0;
		int fin = Math.min(tamanoBloque - 1, arreglo.length - 1);

		while (inicio < arreglo.length && arreglo[fin] < clave) {
			inicio = fin + 1;
			if (inicio >= arreglo.length) {
				return -1;
			}
			fin = Math.min(fin + tamanoBloque, arreglo.length - 1);
		}

		for (int i = inicio; i <= fin; i++) {
			if (arreglo[i] == clave) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arreglo = { 20, 5, 10, 8, 35, 60, 16, 44, 35 };
		int clave = 35;

		System.out.println("=== Busqueda secuencial por bloques ===\n");
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
