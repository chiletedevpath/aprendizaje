public class EjecutarListaMultiple {
	public static void main(String[] args) {
		ListaMultiple lista = new ListaMultiple();

		lista.cargarDatosIniciales();
		lista.mostrarTodo("Tabla inicial");

		lista.agregarRegistro(5, 500, "Cliente A", "Direccion 2", 1000.00);
		lista.mostrarTodo("Despues de agregar clave 5 - Cliente A");

		lista.agregarRegistro(100, 3, "Cliente B", "Direccion 1", 2000.00);
		lista.mostrarTodo("Despues de agregar clave 100 - Cliente B");

		lista.eliminarRegistro(23, "Cliente C");
		lista.mostrarTodo("Despues de eliminar clave 23 - Cliente C");

		lista.eliminarRegistro(94, "Cliente F");
		lista.mostrarTodo("Despues de eliminar clave 94 - Cliente F");
	}
}
