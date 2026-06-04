public class EjecutarListaMultiple {
	public static void main(String[] args) {
		ListaMultiple lista = new ListaMultiple();

		lista.cargarDatosIniciales();
		lista.mostrarTodo("Tabla Inicial");

		lista.agregarRegistro(5, 500, "Juan Pérez", "Jirón 2", 1000.00);
		lista.mostrarTodo("Después de agregar Clave 5 - Juan Pérez");

		lista.agregarRegistro(100, 3, "María Robles", "Pasaje 1", 2000.00);
		lista.mostrarTodo("Después de agregar Clave 100 - María Robles");

		lista.eliminarRegistro(23, "Yolanda Morales");
		lista.mostrarTodo("Después de eliminar Clave 23 - Yolanda Morales");

		lista.eliminarRegistro(94, "Ana Torres");
		lista.mostrarTodo("Después de eliminar Clave 94 - Ana Torres");
	}
}
