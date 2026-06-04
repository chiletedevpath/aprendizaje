public class Trabajador {

	public String nombre;
	public String apellido;
	public int edad;
	public int dni;
	public double sueldo;
	public boolean esContratado;

	public Trabajador() {
		super();
	}

	public Trabajador(String nombre, String apellido, int edad, int dni, double sueldo, boolean esContratado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.sueldo = sueldo;
		this.esContratado = esContratado;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isEsContratado() {
		return esContratado;
	}

	public void setEsContratado(boolean esContratado) {
		this.esContratado = esContratado;
	}
}

