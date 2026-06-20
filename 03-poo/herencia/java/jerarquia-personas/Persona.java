public class Persona {
	private String dni;
	private String nombre;

	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	public void comer() {
		System.out.println("La persona esta comiendo");
	}

	public void calcularEdad() {
		System.out.println("La edad es: ");
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "DNI: " + dni + ", Nombre: " + nombre;
	}
}

