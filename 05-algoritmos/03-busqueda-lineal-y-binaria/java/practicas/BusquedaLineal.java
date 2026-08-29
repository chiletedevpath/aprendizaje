public class BusquedaLineal {

	static int buscar(int[] arreglo, int clave) {
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == clave) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] valoresEjercicio01 = { 19, 14, 12, 22, 9, 25, 8, 27, 5, 28, 7, 33, 4, 37, 17, 2 };

		System.out.println("Ejercicio 01:");
		System.out.println("Busqueda lineal sobre datos desordenados\n");

		System.out.print("Arreglo original: ");
		for (int num : valoresEjercicio01) {
			System.out.print(num + " ");
		}

		int clave = 22;
		int posicion = buscar(valoresEjercicio01, clave);

		if (posicion != -1) {
			System.out.println("\n\nEl numero " + clave + " se encuentra en la posicion: " + posicion);
		} else {
			System.out.println("\n\nEl numero " + clave + " no se encuentra en el arreglo.");
		}
	}
}
