public class DobleHashing {
	private Integer[] tabla;
	private int tamaño;

	public DobleHashing(int tamaño) {
		this.tamaño = tamaño;
		this.tabla = new Integer[tamaño];
	}

	private int primeraFuncion(int clave) {
		return clave % tamaño;
	}

	private int segundaFuncion(int clave) {
		int g = 7 - (clave % 5);
		return (g % tamaño == 0) ? 1 : g; // regla práctica
	}

	public void insertar(int clave) {
		int indice = primeraFuncion(clave);
		System.out.println("Clave " + clave + " → f(x) = " + indice);

		if (tabla[indice] == null) {
			tabla[indice] = clave;
			System.out.println("   Insertada en posición " + indice);
			return;
		}

		// Si hubo colisión
		int salto = segundaFuncion(clave);
		int intentos = 1;
		System.out.println("   Colisión en " + indice + " → aplicamos g(x) = " + salto);

		while (intentos < tamaño) {
			int nuevoIndice = (indice + intentos * salto) % tamaño;
			System.out.println("   Intento " + intentos + " → Posición " + nuevoIndice);

			if (tabla[nuevoIndice] == null) {
				tabla[nuevoIndice] = clave;
				System.out.println("   Insertada en posición " + nuevoIndice);
				return;
			}
			intentos++;
		}

		System.out.println("   No se pudo insertar la clave " + clave + " (tabla llena).");
	}

	public void mostrarTabla() {
		System.out.println("\n=== Estado final de la tabla ===");
		System.out.println("-------------------------------");
		for (int i = 0; i < tamaño; i++) {
			if (tabla[i] != null) {
				System.out.println("Índice " + i + " → Clave: " + tabla[i]);
			} else {
				System.out.println("Índice " + i + " → [vacío]");
			}
		}
		System.out.println("-------------------------------\n");
	}
}



