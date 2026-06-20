public class DobleHashing {
	private Integer[] tabla;
	private int tamano;

	public DobleHashing(int tamano) {
		this.tamano = tamano;
		this.tabla = new Integer[tamano];
	}

	private int primeraFuncion(int clave) {
		return clave % tamano;
	}

	private int segundaFuncion(int clave) {
		int g = 7 - (clave % 5);
		return (g % tamano == 0) ? 1 : g; // Regla practica para evitar salto cero.
	}

	public void insertar(int clave) {
		int indice = primeraFuncion(clave);
		System.out.println("Clave " + clave + " -> f(x) = " + indice);

		if (tabla[indice] == null) {
			tabla[indice] = clave;
			System.out.println("   Insertada en posicion " + indice);
			return;
		}

		// Aplica doble hashing cuando existe colision.
		int salto = segundaFuncion(clave);
		int intentos = 1;
		System.out.println("   Colision en " + indice + " -> aplicamos g(x) = " + salto);

		while (intentos < tamano) {
			int nuevoIndice = (indice + intentos * salto) % tamano;
			System.out.println("   Intento " + intentos + " -> Posicion " + nuevoIndice);

			if (tabla[nuevoIndice] == null) {
				tabla[nuevoIndice] = clave;
				System.out.println("   Insertada en posicion " + nuevoIndice);
				return;
			}
			intentos++;
		}

		System.out.println("   No se pudo insertar la clave " + clave + " (tabla llena).");
	}

	public void mostrarTabla() {
		System.out.println("\n=== Estado final de la tabla ===");
		System.out.println("-------------------------------");
		for (int i = 0; i < tamano; i++) {
			if (tabla[i] != null) {
				System.out.println("Indice " + i + " -> Clave: " + tabla[i]);
			} else {
				System.out.println("Indice " + i + " -> [vacio]");
			}
		}
		System.out.println("-------------------------------\n");
	}
}
