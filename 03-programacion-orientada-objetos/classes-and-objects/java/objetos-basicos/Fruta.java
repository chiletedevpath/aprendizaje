public class Fruta {

	public String color;
	public boolean esMadura;
	public String tipo;
	public double precio;
	public double peso;
	public String sabor;

	public Fruta() {
		super();
	}

	public Fruta(String color, boolean esMadura, String tipo, double precio, double peso, String sabor) {
		super();
		this.color = color;
		this.esMadura = esMadura;
		this.tipo = tipo;
		this.precio = precio;
		this.peso = peso;
		this.sabor = sabor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isEsMadura() {
		return esMadura;
	}

	public void setEsMadura(boolean esMadura) {
		this.esMadura = esMadura;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	
	
	
}

