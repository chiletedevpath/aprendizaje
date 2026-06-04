public class Nodo {
	int clave; // Clave que se almacena en el nodo
	Nodo siguiente; // Referencia al siguiente nodo en la lista enlazada

	// Constructor que inicializa la clave
	public Nodo(int clave) {
		this.clave = clave;
		this.siguiente = null;
	}
}
