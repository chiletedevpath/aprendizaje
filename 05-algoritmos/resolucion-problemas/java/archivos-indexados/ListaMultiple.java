import java.util.*;

public class ListaMultiple {
	List<Clave> archivoClaves = new ArrayList<>();
	List<Cliente> archivoClientes = new ArrayList<>();
	List<Ubicacion> archivoUbicaciones = new ArrayList<>();

	public void cargarDatosIniciales() {
		archivoClaves.add(new Clave(0, 8, 600));
		archivoClaves.add(new Clave(1, 17, 480));
		archivoClaves.add(new Clave(2, 23, 120));
		archivoClaves.add(new Clave(3, 45, 240));
		archivoClaves.add(new Clave(4, 87, 360));
		archivoClaves.add(new Clave(5, 94, 0));
		archivoClaves.add(new Clave(6, -1, -1));
		archivoClaves.add(new Clave(7, -1, -1));

		archivoClientes.add(new Cliente(7, 94, "Cliente F", "Direccion 1", 1800.00));
		archivoClientes.add(new Cliente(6, 87, "Cliente H", "Direccion 2", 5890.00));
		archivoClientes.add(new Cliente(5, 45, "Cliente G", "Direccion 3", 6200.00));
		archivoClientes.add(new Cliente(4, 23, "Cliente C", "Direccion 4", 2900.00));
		archivoClientes.add(new Cliente(3, 17, "Cliente E", "Direccion 5", 3800.00));
		archivoClientes.add(new Cliente(2, 8, "Cliente D", "Direccion 6", 4100.00));
		archivoClientes.add(new Cliente(1, -1, null, null, 0.0));
		archivoClientes.add(new Cliente(0, -1, null, null, 0.0));

		archivoUbicaciones.add(new Ubicacion(0, "Cliente F", 0));
		archivoUbicaciones.add(new Ubicacion(1, "Cliente H", 600));
		archivoUbicaciones.add(new Ubicacion(2, "Cliente G", 480));
		archivoUbicaciones.add(new Ubicacion(3, "Cliente C", 120));
		archivoUbicaciones.add(new Ubicacion(4, "Cliente E", 240));
		archivoUbicaciones.add(new Ubicacion(5, "Cliente D", 360));
		archivoUbicaciones.add(new Ubicacion(6, null, -1));
		archivoUbicaciones.add(new Ubicacion(7, null, -1));
	}

	public void agregarRegistro(int clave, int ubicacion, String nombre, String direccion, double saldo) {
		for (Clave c : archivoClaves) {
			if (c.clave == clave)
				return;
		}

		int posClave = 0;
		while (posClave < archivoClaves.size() && archivoClaves.get(posClave).clave < clave
				&& archivoClaves.get(posClave).clave != -1) {
			posClave++;
		}
		archivoClaves.add(posClave, new Clave(posClave, clave, ubicacion));
		actualizarIndices(archivoClaves);

		int posCliente = 0;
		while (posCliente < archivoClientes.size() && archivoClientes.get(posCliente).clave > clave
				&& archivoClientes.get(posCliente).clave != -1) {
			posCliente++;
		}
		archivoClientes.add(posCliente, new Cliente(posCliente, clave, nombre, direccion, saldo));
		actualizarIndices(archivoClientes);

		archivoUbicaciones.add(0, new Ubicacion(archivoUbicaciones.size(), nombre, ubicacion));
	}

	public void eliminarRegistro(int clave, String nombre) {
		for (int i = 0; i < archivoClaves.size(); i++) {
			Clave c = archivoClaves.get(i);
			if (c.clave == clave) {
				archivoClaves.set(i, new Clave(i, -1, -1));
				break;
			}
		}

		for (int i = 0; i < archivoClientes.size(); i++) {
			Cliente cl = archivoClientes.get(i);
			if (cl.clave == clave && cl.nombre != null && cl.nombre.equals(nombre)) {
				archivoClientes.set(i, new Cliente(i, -1, null, null, 0.0));
				break;
			}
		}

		for (int i = 0; i < archivoUbicaciones.size(); i++) {
			Ubicacion u = archivoUbicaciones.get(i);
			if (u.nombre != null && u.nombre.equals(nombre)) {
				archivoUbicaciones.set(i, new Ubicacion(i, null, -1));
				break;
			}
		}
	}

	private void actualizarIndices(List<?> lista) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof Clave)
				((Clave) lista.get(i)).indice = i;
			else if (lista.get(i) instanceof Cliente)
				((Cliente) lista.get(i)).indice = i;
		}
	}

	public void mostrarTodo(String titulo) {
		System.out.println("\n" + titulo);
		System.out.printf("%-40s %-60s %-40s\n", "Archivo de Claves", "Archivo Clientes", "Archivo de Ubicaciones");
		System.out.printf("%-7s %-7s %-10s %-10s\t", "Indice", "Clave", "Ubicacion", "Puntero");
		System.out.printf("%-7s %-7s %-20s %-15s %-10s %-10s\t", "Indice", "Clave", "Nombre", "Direccion", "Saldo",
				"Puntero");
		System.out.printf("%-7s %-20s %-10s\n", "Indice", "Nombre", "Ubicacion");

		int max = Math.max(archivoClaves.size(), Math.max(archivoClientes.size(), archivoUbicaciones.size()));
		for (int i = 0; i < max; i++) {
			if (i < archivoClaves.size()) {
				Clave c = archivoClaves.get(i);
				System.out.printf("%-7d %-7s %-10s %-10s\t", c.indice, c.clave == -1 ? "Null" : c.clave,
						c.ubicacion == -1 ? "Null" : c.ubicacion, c.puntero == -1 ? "" : c.puntero);
			} else {
				System.out.printf("%-7s %-7s %-10s %-10s\t", "", "", "", "");
			}

			if (i < archivoClientes.size()) {
				Cliente cl = archivoClientes.get(i);
				System.out.printf("%-7d %-7s %-20s %-15s %-10s %-10s\t", cl.indice, cl.clave == -1 ? "Null" : cl.clave,
						cl.nombre == null ? "Null" : cl.nombre, cl.direccion == null ? "Null" : cl.direccion,
						cl.clave == -1 ? "Null" : String.format("S/ %.2f", cl.saldo),
						cl.puntero == -1 ? "" : cl.puntero);
			} else {
				System.out.printf("%-7s %-7s %-20s %-15s %-10s %-10s\t", "", "", "", "", "", "");
			}

			if (i < archivoUbicaciones.size()) {
				Ubicacion u = archivoUbicaciones.get(i);
				System.out.printf("%-7d %-20s %-10s\n", u.indice, u.nombre == null ? "Null" : u.nombre,
						u.ubicacion == -1 ? "Null" : u.ubicacion);
			} else {
				System.out.printf("%-7s %-20s %-10s\n", "", "", "");
			}
		}
	}
}
