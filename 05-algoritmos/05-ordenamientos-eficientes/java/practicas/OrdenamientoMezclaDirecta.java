public class OrdenamientoMezclaDirecta {

	public static void mezclaDirecta(int[] arreglo) {
		mezclaDirecta(arreglo, 0, arreglo.length - 1);
	}

	private static void mezclaDirecta(int[] arreglo, int izquierda, int derecha) {
		if (izquierda >= derecha) {
			return;
		}

		int medio = izquierda + (derecha - izquierda) / 2;
		mezclaDirecta(arreglo, izquierda, medio);
		mezclaDirecta(arreglo, medio + 1, derecha);
		mezclar(arreglo, izquierda, medio, derecha);
	}

	private static void mezclar(int[] arreglo, int izquierda, int medio, int derecha) {
		int[] auxiliar = new int[derecha - izquierda + 1];
		int i = izquierda;
		int j = medio + 1;
		int k = 0;

		while (i <= medio && j <= derecha) {
			auxiliar[k++] = arreglo[i] <= arreglo[j] ? arreglo[i++] : arreglo[j++];
		}
		while (i <= medio) {
			auxiliar[k++] = arreglo[i++];
		}
		while (j <= derecha) {
			auxiliar[k++] = arreglo[j++];
		}

		for (int posicion = 0; posicion < auxiliar.length; posicion++) {
			arreglo[izquierda + posicion] = auxiliar[posicion];
		}
	}

	public static void main(String[] args) {
		int[] arreglo = { 31, 4, 88, 2, 4, 2, 42 };
		mezclaDirecta(arreglo);

		for (int valor : arreglo) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
}
