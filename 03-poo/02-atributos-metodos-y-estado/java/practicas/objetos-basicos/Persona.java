public class Persona {

	public String nombre;
	public String apellido;
	public int dni;
	public int telefono;
	public String correo;
	public String fechaCumple;

	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, int dni, int telefono, String correo, String fechaCumple) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.correo = correo;
		this.fechaCumple = fechaCumple;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFechaCumple() {
		return fechaCumple;
	}

	public void setFechaCumple(String fechaCumple) {
		this.fechaCumple = fechaCumple;
	}
}

