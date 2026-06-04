public class Taza {
	public String color;
	public double peso;
	public String figura;
	public double tamano;
	public double volumen;
	public boolean conAsa;
		
	public Taza() {
		super();
	}

	public Taza(String color, double peso, String figura, double tamano, double volumen, boolean conAsa) {
		super();
		this.color = color;
		this.peso = peso;
		this.figura = figura;
		this.tamano = tamano;
		this.volumen = volumen;
		this.conAsa = conAsa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public boolean isConAsa() {
		return conAsa;
	}

	public void setConAsa(boolean conAsa) {
		this.conAsa = conAsa;
	}
}

