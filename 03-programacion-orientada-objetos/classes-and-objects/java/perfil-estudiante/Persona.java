public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String semestre;
	private String carrera;

	public Persona() {
	}

	public Persona(String nombre, String apellido, int edad, String semestre, String carrera) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.semestre = semestre;
		this.carrera = carrera;
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

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	// METODO PARA MOSTRAR MIS DATOS
	@Override
	public String toString() {
		return "Nombres: " + nombre + "\nApellidos: " + apellido + "\nEdad: " + edad + "\nSemestre: " + semestre
				+ "\nCarrera: " + carrera;
	}
}

