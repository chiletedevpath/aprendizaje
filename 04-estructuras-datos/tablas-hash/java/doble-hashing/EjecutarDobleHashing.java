public class EjecutarDobleHashing {
	public static void main(String[] args) {
		int tamanoTabla = 7;
		int[] claves = { 20, 33, 21, 10, 12, 14, 56, 100 };

		System.out.println("=== Claves a insertar ===");
		for (int clave : claves) {
			System.out.print(clave + " ");
		}
		System.out.println("\n");

		DobleHashing tabla = new DobleHashing(tamanoTabla);

		for (int clave : claves) {
			tabla.insertar(clave);
			System.out.println();
		}

		tabla.mostrarTabla();
	}
}
