public class Persona {
	private String dni;
	private String nombre;

	public Persona(String dni, String nombre) {
		this.dni = validarDni(dni);
		this.nombre = validarNombre(nombre);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = validarDni(dni);
	}

	private static String validarDni(String dni) {
		if (dni == null || !dni.matches("\\d{8}")) {
			throw new IllegalArgumentException("El DNI ficticio debe contener 8 dígitos.");
		}
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = validarNombre(nombre);
	}

	private static String validarNombre(String nombre) {
		if (nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre es obligatorio.");
		}
		return nombre.trim();
	}

	@Override
	public String toString() {
		return "DNI: " + dni + ", Nombre: " + nombre;
	}
}

