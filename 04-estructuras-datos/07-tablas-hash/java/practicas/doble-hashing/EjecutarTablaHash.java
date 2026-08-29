import java.util.Scanner;

public class EjecutarTablaHash {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {

		// Solicita cuantas claves se van a ingresar.
		System.out.print("Cuantas claves deseas ingresar?: ");
		int n = teclado.nextInt();

		if (n <= 0) {
			System.out.println("La cantidad debe ser mayor que cero.");
			return;
		}

		TablaHash tabla = new TablaHash(n);

		// Ingresa las claves una por una.
		for (int i = 0; i < n; i++) {
			System.out.print("Ingresa la clave #" + (i + 1) + ": ");
			int clave = teclado.nextInt();
			if (!tabla.insertar(clave)) {
				System.out.println("La clave ya estaba registrada.");
			}
		}

		tabla.mostrar();

		System.out.print("\nDeseas buscar una clave? Ingresa la clave: ");
		int claveBuscada = teclado.nextInt();
		if (tabla.buscar(claveBuscada)) {
			System.out.println("La clave " + claveBuscada + " fue encontrada.");
		} else {
			System.out.println("La clave " + claveBuscada + " no esta en la tabla.");
		}

		System.out.print("\nDeseas eliminar una clave? Ingresa la clave: ");
		int claveEliminar = teclado.nextInt();
		if (tabla.eliminar(claveEliminar)) {
			System.out.println("La clave " + claveEliminar + " fue eliminada.");
		} else {
			System.out.println("La clave " + claveEliminar + " no se encontro.");
		}

		tabla.mostrar();
		}
	}
}
