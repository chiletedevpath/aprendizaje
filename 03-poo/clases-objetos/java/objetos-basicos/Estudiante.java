public class Estudiante {
	private String foto;
	public int id;
	public String nombre;
	public String apellido;
	public int grado;
	public String genero;
	public double promedio;

	public Estudiante() {
		super();
	}

	public Estudiante(String foto, int id, String nombre, String apellido, int grado, String genero,
			double promedio) {
		super();
		this.foto = foto;
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.grado = grado;
		this.genero = genero;
		this.promedio = promedio;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

}

