public class Animal {
	public String foto;
	public String nombre;
	public int edad;
	public String especie;
	public double peso;
	public String color;
	public boolean esRaza;

	public Animal() {
		super();
	}

	public Animal(String foto, String nombre, int edad, String especie, double peso, String color,
			boolean esRaza) {
		super();
		this.foto = foto;
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
		this.peso = peso;
		this.color = color;
		this.esRaza = esRaza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean getEsRaza() {
		return esRaza;
	}

	public void setEsRaza(boolean esRaza) {
		this.esRaza = esRaza;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String raza() {
		if (esRaza) {
			return "si";
		} else {
			return "no";
		}

	}
}

