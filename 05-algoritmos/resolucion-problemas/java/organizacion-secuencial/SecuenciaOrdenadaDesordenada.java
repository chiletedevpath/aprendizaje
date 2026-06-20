public class SecuenciaOrdenadaDesordenada {

	public static void main(String[] args) {

		int[] arreglo = { 20, 5, 10, 8, 35, 60, 16, 44, 35 };
		int clave = 35;

		System.out.println("=== Busqueda secuencial ordenada y desordenada ===\n");

		System.out.print("Arreglo original: ");
		for (int num : arreglo) {
			System.out.print(num + " ");
		}
		System.out.println("\nClave a buscar: " + clave + "\n");

		System.out.println(">>> Busqueda secuencial desordenada <<<");
		int resultadoDes = busquedaSecuencialDesordenada(arreglo, clave);
		if (resultadoDes != -1) {
			System.out.println("Elemento encontrado en la posicion: " + resultadoDes);
		} else {
			System.out.println("Elemento no encontrado.");
		}
		System.out.println();

		System.out.println(">>> Busqueda secuencial ordenada <<<");
		int[] arregloOrdenado = arreglo.clone();
		java.util.Arrays.sort(arregloOrdenado);

		System.out.print("Arreglo ordenado: ");
		for (int num : arregloOrdenado) {
			System.out.print(num + " ");
		}
		System.out.println();

		int resultadoOrd = busquedaSecuencialOrdenada(arregloOrdenado, clave);
		if (resultadoOrd != -1) {
			System.out.println("Elemento encontrado en la posicion ordenada: " + resultadoOrd);
		} else {
			System.out.println("Elemento no encontrado en el arreglo ordenado.");
		}
	}

	public static int busquedaSecuencialDesordenada(int[] arreglo, int clave) {
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == clave) {
				return i;
			}
		}
		return -1;
	}

	public static int busquedaSecuencialOrdenada(int[] arreglo, int clave) {
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == clave) {
				return i;
			}
			if (arreglo[i] > clave) {
				break;
			}
		}
		return -1;
	}
}
