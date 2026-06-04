public class Cliente {
	int indice;
	int clave;
	String nombre;
	String direccion;
	double saldo;
	int puntero;

	public Cliente(int indice, int clave, String nombre, String direccion, double saldo) {
		this.indice = indice;
		this.clave = clave;
		this.nombre = nombre;
		this.direccion = direccion;
		this.saldo = saldo;
		this.puntero = -1;
	}
}