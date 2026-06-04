public class Televisor {

	public String marca;
	public boolean peso;
	public String modelo;
	public String serie;
	public int cantVolumen;
	public boolean encendido;

	public Televisor() {
		super();
	}

	public Televisor(String marca, boolean peso, String modelo, String serie, int cantVolumen,
			boolean encendido) {
		super();
		this.marca = marca;
		this.peso = peso;
		this.modelo = modelo;
		this.serie = serie;
		this.cantVolumen = cantVolumen;
		this.encendido = encendido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isPeso() {
		return peso;
	}

	public void setPeso(boolean peso) {
		this.peso = peso;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public int getCantVolumen() {
		return cantVolumen;
	}

	public void setCantVolumen(int cantVolumen) {
		this.cantVolumen = cantVolumen;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
}

