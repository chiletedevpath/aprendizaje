public class OrdenamientoFusionNatural {

	public static void fusionNatural(int[] arreglo) {
		int[] auxiliar = new int[arreglo.length];
		boolean huboMezclas;

		do {
			huboMezclas = false;
			int inicio = 0;

			while (inicio < arreglo.length) {
				int finPrimero = encontrarFinTramo(arreglo, inicio);
				int inicioSegundo = finPrimero + 1;
				if (inicioSegundo >= arreglo.length) {
					break;
				}

				int finSegundo = encontrarFinTramo(arreglo, inicioSegundo);
				mezclar(arreglo, auxiliar, inicio, finPrimero, inicioSegundo, finSegundo);
				huboMezclas = true;
				inicio = finSegundo + 1;
			}
		} while (huboMezclas);
	}

	private static int encontrarFinTramo(int[] arreglo, int inicio) {
		int fin = inicio;
		while (fin + 1 < arreglo.length && arreglo[fin] <= arreglo[fin + 1]) {
			fin++;
		}
		return fin;
	}

	private static void mezclar(int[] arreglo, int[] auxiliar,
			int inicioPrimero, int finPrimero, int inicioSegundo, int finSegundo) {
		int i = inicioPrimero;
		int j = inicioSegundo;
		int k = inicioPrimero;

		while (i <= finPrimero && j <= finSegundo) {
			auxiliar[k++] = arreglo[i] <= arreglo[j] ? arreglo[i++] : arreglo[j++];
		}
		while (i <= finPrimero) {
			auxiliar[k++] = arreglo[i++];
		}
		while (j <= finSegundo) {
			auxiliar[k++] = arreglo[j++];
		}
		for (int posicion = inicioPrimero; posicion <= finSegundo; posicion++) {
			arreglo[posicion] = auxiliar[posicion];
		}
	}

	public static void main(String[] args) {
		int[] datos = { 14, 27, 33, 5, 8, 11, 23, 44, 22, 31, 46, 7, 8, 1 };
		fusionNatural(datos);

		for (int valor : datos) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
}
