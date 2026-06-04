public class BuscarNumeroMayor {

	public static void main(String[] args) {

		int[] valores = { 15, 8, 40, 22, 9 };

		int mayor = valores[0];

		// Recorre el arreglo desde el segundo elemento para comparar contra el mayor actual.
		for (int i = 1; i < valores.length; i++) {
			if (valores[i] > mayor) {
				mayor = valores[i];
			}
		}

		System.out.println("El numero mayor del arreglo es: " + mayor);

	}
}
