public class EjecutarArchivoSimple {
	public static void main(String[] args) {
		System.out.println("\n===================================================================");
		System.out.println("\t\t\tBUSQUEDA CON LISTAS INVERSAS");
		System.out.println("===================================================================\n");

		ListaInversaSimple sistema = new ListaInversaSimple();
		sistema.cargarDatosIniciales();

		System.out.println("Tabla inicial:");
		sistema.mostrarTablaFormatted();

		System.out.println("Operacion: Agregar -> (5, 500, Cliente A)");
		sistema.agregar(5, 500, "Cliente A");
		sistema.mostrarTablaFormatted();

		System.out.println("Operacion: Agregar -> (100, 3, Cliente B)");
		sistema.agregar(100, 3, "Cliente B");
		sistema.mostrarTablaFormatted();

		System.out.println("Operacion: Eliminar -> (23, Cliente C)");
		sistema.eliminar(23, "Cliente C");
		sistema.mostrarTablaFormatted();

		System.out.println("Operacion: Eliminar -> (8, Cliente D)");
		sistema.eliminar(8, "Cliente D");
		sistema.mostrarTablaFormatted();

		System.out.println("=== FIN ===");
	}
}
