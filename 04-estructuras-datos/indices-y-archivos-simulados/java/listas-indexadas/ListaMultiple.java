import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaMultiple {
	private final List<Clave> archivoClaves = new ArrayList<>();
	private final List<Cliente> archivoClientes = new ArrayList<>();
	private final List<Ubicacion> archivoUbicaciones = new ArrayList<>();

	public void cargarDatosIniciales() {
		archivoClaves.clear();
		archivoClientes.clear();
		archivoUbicaciones.clear();

		agregarRegistro(8, 600, "Cliente D", "Dirección 6", 4100.00);
		agregarRegistro(17, 480, "Cliente E", "Dirección 5", 3800.00);
		agregarRegistro(23, 120, "Cliente C", "Dirección 4", 2900.00);
		agregarRegistro(45, 240, "Cliente G", "Dirección 3", 6200.00);
		agregarRegistro(87, 360, "Cliente H", "Dirección 2", 5890.00);
		agregarRegistro(94, 0, "Cliente F", "Dirección 1", 1800.00);
	}

	public boolean agregarRegistro(int clave, int ubicacion, String nombre, String direccion, double saldo) {
		validarRegistro(clave, ubicacion, nombre, direccion, saldo);

		if (contieneClave(clave)) {
			System.out.println("La clave " + clave + " ya existe.");
			return false;
		}

		archivoClaves.add(new Clave(0, clave, ubicacion));
		archivoClientes.add(new Cliente(0, clave, nombre.trim(), direccion.trim(), saldo));
		archivoUbicaciones.add(new Ubicacion(0, nombre.trim(), ubicacion));
		reconstruirIndices();
		return true;
	}

	public boolean eliminarRegistro(int clave, String nombre) {
		int indiceClave = buscarIndiceClave(clave);
		int indiceCliente = buscarIndiceCliente(clave, nombre);
		int indiceUbicacion = buscarUbicacion(nombre);

		if (indiceClave < 0 || indiceCliente < 0 || indiceUbicacion < 0) {
			System.out.println("No existe una relación completa para la clave y el nombre indicados.");
			return false;
		}

		archivoClaves.remove(indiceClave);
		archivoClientes.remove(indiceCliente);
		archivoUbicaciones.remove(indiceUbicacion);
		reconstruirIndices();
		return true;
	}

	private void reconstruirIndices() {
		archivoClaves.sort(Comparator.comparingInt(registro -> registro.clave));
		archivoClientes.sort(Comparator.comparingInt((Cliente registro) -> registro.clave).reversed());
		archivoUbicaciones.sort(Comparator.comparingInt(registro -> registro.ubicacion));

		for (int i = 0; i < archivoClaves.size(); i++) {
			Clave clave = archivoClaves.get(i);
			clave.indice = i;
			clave.puntero = buscarCliente(clave.clave);
		}

		for (int i = 0; i < archivoClientes.size(); i++) {
			Cliente cliente = archivoClientes.get(i);
			cliente.indice = i;
			cliente.puntero = buscarUbicacion(cliente.nombre);
		}

		for (int i = 0; i < archivoUbicaciones.size(); i++) {
			archivoUbicaciones.get(i).indice = i;
		}
	}

	private int buscarCliente(int clave) {
		for (int i = 0; i < archivoClientes.size(); i++) {
			if (archivoClientes.get(i).clave == clave) {
				return i;
			}
		}
		return -1;
	}

	private int buscarIndiceClave(int clave) {
		for (int i = 0; i < archivoClaves.size(); i++) {
			if (archivoClaves.get(i).clave == clave) {
				return i;
			}
		}
		return -1;
	}

	private int buscarIndiceCliente(int clave, String nombre) {
		for (int i = 0; i < archivoClientes.size(); i++) {
			Cliente cliente = archivoClientes.get(i);
			if (cliente.clave == clave && cliente.nombre.equalsIgnoreCase(nombre)) {
				return i;
			}
		}
		return -1;
	}

	private int buscarUbicacion(String nombre) {
		for (int i = 0; i < archivoUbicaciones.size(); i++) {
			if (archivoUbicaciones.get(i).nombre.equalsIgnoreCase(nombre)) {
				return i;
			}
		}
		return -1;
	}

	private boolean contieneClave(int clave) {
		for (Clave registro : archivoClaves) {
			if (registro.clave == clave) {
				return true;
			}
		}
		return false;
	}

	private void validarRegistro(int clave, int ubicacion, String nombre, String direccion, double saldo) {
		if (clave < 0 || ubicacion < 0 || saldo < 0) {
			throw new IllegalArgumentException("Clave, ubicación y saldo no pueden ser negativos.");
		}
		if (nombre == null || nombre.isBlank() || direccion == null || direccion.isBlank()) {
			throw new IllegalArgumentException("Nombre y dirección son obligatorios.");
		}
	}

	public void mostrarTodo(String titulo) {
		System.out.println("\n" + titulo);
		System.out.printf("%-40s %-60s %-40s%n", "Archivo de Claves", "Archivo Clientes", "Archivo de Ubicaciones");
		System.out.printf("%-7s %-7s %-10s %-10s\t", "Índice", "Clave", "Ubicación", "Puntero");
		System.out.printf("%-7s %-7s %-20s %-15s %-12s %-10s\t", "Índice", "Clave", "Nombre", "Dirección", "Saldo",
				"Puntero");
		System.out.printf("%-7s %-20s %-10s%n", "Índice", "Nombre", "Ubicación");

		int maximo = Math.max(archivoClaves.size(), Math.max(archivoClientes.size(), archivoUbicaciones.size()));
		for (int i = 0; i < maximo; i++) {
			mostrarClave(i);
			mostrarCliente(i);
			mostrarUbicacion(i);
		}
	}

	private void mostrarClave(int indice) {
		if (indice < archivoClaves.size()) {
			Clave clave = archivoClaves.get(indice);
			System.out.printf("%-7d %-7d %-10d %-10d\t", clave.indice, clave.clave, clave.ubicacion, clave.puntero);
		} else {
			System.out.printf("%-7s %-7s %-10s %-10s\t", "", "", "", "");
		}
	}

	private void mostrarCliente(int indice) {
		if (indice < archivoClientes.size()) {
			Cliente cliente = archivoClientes.get(indice);
			System.out.printf("%-7d %-7d %-20s %-15s S/ %-9.2f %-10d\t", cliente.indice, cliente.clave,
					cliente.nombre, cliente.direccion, cliente.saldo, cliente.puntero);
		} else {
			System.out.printf("%-7s %-7s %-20s %-15s %-12s %-10s\t", "", "", "", "", "", "");
		}
	}

	private void mostrarUbicacion(int indice) {
		if (indice < archivoUbicaciones.size()) {
			Ubicacion ubicacion = archivoUbicaciones.get(indice);
			System.out.printf("%-7d %-20s %-10d%n", ubicacion.indice, ubicacion.nombre, ubicacion.ubicacion);
		} else {
			System.out.println();
		}
	}
}
