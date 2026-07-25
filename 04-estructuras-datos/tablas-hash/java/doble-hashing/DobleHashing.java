public class DobleHashing {
	private final Integer[] tabla;

	public DobleHashing(int tamano) {
		if (!esPrimo(tamano)) {
			throw new IllegalArgumentException("El tamaño debe ser un número primo mayor que 2.");
		}
		this.tabla = new Integer[tamano];
	}

	private int primeraFuncion(int clave) {
		return Math.floorMod(clave, tabla.length);
	}

	private int segundaFuncion(int clave) {
		return 1 + Math.floorMod(clave, tabla.length - 1);
	}

	public boolean insertar(int clave) {
		if (buscar(clave)) {
			System.out.println("La clave " + clave + " ya existe.");
			return false;
		}

		int indiceInicial = primeraFuncion(clave);
		int salto = segundaFuncion(clave);
		System.out.println("Clave " + clave + " -> f(x) = " + indiceInicial + ", g(x) = " + salto);

		for (int intento = 0; intento < tabla.length; intento++) {
			int indice = Math.floorMod(indiceInicial + intento * salto, tabla.length);
			System.out.println("   Intento " + (intento + 1) + " -> posición " + indice);

			if (tabla[indice] == null) {
				tabla[indice] = clave;
				System.out.println("   Insertada en posición " + indice);
				return true;
			}
		}

		System.out.println("   No se pudo insertar la clave " + clave + ": tabla llena.");
		return false;
	}

	public boolean buscar(int clave) {
		int indiceInicial = primeraFuncion(clave);
		int salto = segundaFuncion(clave);

		for (int intento = 0; intento < tabla.length; intento++) {
			int indice = Math.floorMod(indiceInicial + intento * salto, tabla.length);

			if (tabla[indice] == null) {
				return false;
			}
			if (tabla[indice] == clave) {
				return true;
			}
		}
		return false;
	}

	public void mostrarTabla() {
		System.out.println("\n=== Estado final de la tabla ===");
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Índice " + i + " -> " + (tabla[i] == null ? "[vacío]" : "Clave: " + tabla[i]));
		}
	}

	private boolean esPrimo(int numero) {
		if (numero <= 2) {
			return false;
		}
		for (int divisor = 2; divisor * divisor <= numero; divisor++) {
			if (numero % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}
