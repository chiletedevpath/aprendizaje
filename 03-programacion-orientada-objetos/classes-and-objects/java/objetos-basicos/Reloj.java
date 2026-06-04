public class Reloj {
	public String modelo;
	public String color;
	public String marca;
	public int hora;
	public int minuto;
	public int segundo;

	public Reloj() {
		super();
	}

	public Reloj(String modelo, String color, String marca, int hora, int minuto, int segundo) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.marca = marca;
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	

}

