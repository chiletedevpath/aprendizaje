public class TablaHash {
	private final Nodo[] tabla;

	public TablaHash(int tamano) {
		if (tamano <= 0) {
			throw new IllegalArgumentException("El tamaño de la tabla debe ser positivo.");
		}
		tabla = new Nodo[tamano];
	}

	public boolean insertar(int clave) {
		int indice = calcularIndice(clave);

		if (buscar(clave)) {
			return false;
		}

		Nodo nuevo = new Nodo(clave);
		if (tabla[indice] == null) {
			tabla[indice] = nuevo;
			return true;
		}

		Nodo actual = tabla[indice];
		while (actual.siguiente != null) {
			actual = actual.siguiente;
		}
		actual.siguiente = nuevo;
		return true;
	}

	public boolean buscar(int clave) {
		Nodo actual = tabla[calcularIndice(clave)];

		while (actual != null) {
			if (actual.clave == clave) {
				return true;
			}
			actual = actual.siguiente;
		}
		return false;
	}

	public boolean eliminar(int clave) {
		int indice = calcularIndice(clave);
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

	public void mostrar() {
		System.out.println("\n=== Contenido de la tabla hash ===");
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Índice " + i + ": ");
			Nodo actual = tabla[i];

			while (actual != null) {
				System.out.print(actual.clave + " -> ");
				actual = actual.siguiente;
			}
			System.out.println("null");
		}
	}

	private int calcularIndice(int clave) {
		return Math.floorMod(clave, tabla.length);
	}
}
