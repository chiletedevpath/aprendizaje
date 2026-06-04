public class Celular {

	private String foto;
	private String imei;
	private String color;
	private String modelo;
	private String marca;
	private int ram;
	private int camara;

	public Celular() {
		super();
	}

	public Celular(String foto, String imei, String color, String modelo, String marca, int ram,
			int camara) {
		super();
		this.foto = foto;
		this.imei = imei;
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
		this.ram = ram;
		this.camara = camara;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getCamara() {
		return camara;
	}

	public void setCamara(int camara) {
		this.camara = camara;
	}
}

