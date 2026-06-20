public class TablaHash {
	int TAMTABLA; // Tamano de la tabla hash.
	Nodo[] tabla; // Arreglo de listas enlazadas.

	// Constructor: recibe el tamano deseado y crea la tabla.
	public TablaHash(int tamano) {
		this.TAMTABLA = tamano;
		tabla = new Nodo[TAMTABLA];
		for (int i = 0; i < TAMTABLA; i++) {
			tabla[i] = null;
		}
	}

	// Inserta una nueva clave en la tabla hash.
	public void insertar(int clave) {
		int indice = clave % TAMTABLA;
		Nodo nuevo = new Nodo(clave);

		if (tabla[indice] == null) {
			tabla[indice] = nuevo;
		} else {
			Nodo actual = tabla[indice];
			while (actual.siguiente != null) {
				actual = actual.siguiente;
			}
			actual.siguiente = nuevo;
		}
	}

	// Verifica si una clave existe.
	public boolean buscar(int clave) {
		int indice = clave % TAMTABLA;
		Nodo actual = tabla[indice];

		while (actual != null) {
			if (actual.clave == clave) {
				return true;
			}
			actual = actual.siguiente;
		}
		return false;
	}

	// Elimina una clave si existe.
	public boolean eliminar(int clave) {
		int indice = clave % TAMTABLA;
		Nodo actual = tabla[indice];
		Nodo anterior = null;

		while (actual != null) {
			if (actual.clave == clave) {
				if (anterior == null) {
					tabla[indice] = actual.siguiente;
				} else {
					anterior.siguiente = actual.siguiente;
				}
				return true;
			}
			anterior = actual;
			actual = actual.siguiente;
		}
		return false;
	}

	// Imprime el contenido de la tabla.
	public void mostrar() {
		System.out.println("\n=== Contenido de la tabla hash ===");
		for (int i = 0; i < TAMTABLA; i++) {
			System.out.print("Indice " + i + ": ");
			Nodo actual = tabla[i];
			if (actual == null) {
				System.out.println("null");
			} else {
				while (actual != null) {
					System.out.print(actual.clave + " -> ");
					actual = actual.siguiente;
				}
				System.out.println("null");
			}
		}
	}
}
