public class TablaHash {
	int TAMTABLA; // Tamaño de la tabla hash
	Nodo[] tabla; // Arreglo de listas enlazadas

	// Constructor: recibe el tamaño deseado y crea la tabla
	public TablaHash(int tamaño) {
		this.TAMTABLA = tamaño;
		tabla = new Nodo[TAMTABLA];
		for (int i = 0; i < TAMTABLA; i++) {
			tabla[i] = null;
		}
	}

	// Método insertar: agrega una nueva clave a la tabla hash
	public void insertar(int clave) {
		int indice = clave % 7; // ⚡ Se fija la función hash en %7
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

	// Método buscar: verifica si una clave existe
	public boolean buscar(int clave) {
		int indice = clave % 7;
		Nodo actual = tabla[indice];

		while (actual != null) {
			if (actual.clave == clave) {
				return true;
			}
			actual = actual.siguiente;
		}
		return false;
	}

	// Método eliminar: elimina una clave si existe
	public boolean eliminar(int clave) {
		int indice = clave % 7;
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

	// Método mostrar: imprime el contenido de la tabla
	public void mostrar() {
		System.out.println("\n=== Contenido de la tabla hash ===");
		for (int i = 0; i < TAMTABLA; i++) {
			System.out.print("Índice " + i + ": ");
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
