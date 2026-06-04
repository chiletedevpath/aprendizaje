public class EjecutarArchivoSimple {
	public static void main(String[] args) {
		System.out.println("\n===================================================================");
		System.out.println("\t\t\tBÚSQUEDA CON LISTAS INVERSAS");
		System.out.println("===================================================================\n");

		ListaInversaSimple sistema = new ListaInversaSimple();
		sistema.cargarDatosIniciales();

		System.out.println("Tabla inicial:");
		sistema.mostrarTablaFormatted();

		// 1) Agregar Clave: 5, Ubicación: 500, Nombre: Juan Pérez
		System.out.println("Operación: Agregar → (5, 500, Juan Pérez)");
		sistema.agregar(5, 500, "Juan Pérez");
		sistema.mostrarTablaFormatted();

		// 2) Agregar Clave: 100, Ubicación: 3, Nombre: María Robles
		System.out.println("Operación: Agregar → (100, 3, María Robles)");
		sistema.agregar(100, 3, "María Robles");
		sistema.mostrarTablaFormatted();

		// 3) Eliminar Clave: 23, Ubicación: 120, Nombre: Norma Gomez
		System.out.println("Operación: Eliminar → (23, Yolanda Morales)");
		sistema.eliminar(23, "Yolanda Morales");
		sistema.mostrarTablaFormatted();

		// 4) Eliminar Clave: 8, Nombre: Eva Mendez
		System.out.println("Operación: Eliminar → (8, Eva Mendez)");
		sistema.eliminar(8, "Eva Mendez");
		sistema.mostrarTablaFormatted();

		System.out.println("=== FIN ===");
	}
}
