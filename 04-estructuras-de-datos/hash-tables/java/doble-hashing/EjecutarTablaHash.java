import java.util.Scanner;

public class EjecutarTablaHash {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Se pide al usuario cuántas claves va a ingresar
		System.out.print("¿Cuántas claves deseas ingresar?: ");
		int n = teclado.nextInt();

		// Se crea la tabla con tamaño igual al número de claves
		TablaHash tabla = new TablaHash(n);

		// Se ingresan las claves una por una
		for (int i = 0; i < n; i++) {
			System.out.print("Ingresa la clave #" + (i + 1) + ": ");
			int clave = teclado.nextInt();
			tabla.insertar(clave);
		}

		// Se muestra la tabla
		tabla.mostrar();

		// Se permite buscar una clave
		System.out.print("\n¿Deseas buscar una clave? Ingresa la clave: ");
		int claveBuscada = teclado.nextInt();
		if (tabla.buscar(claveBuscada)) {
			System.out.println("La clave " + claveBuscada + " fue encontrada.");
		} else {
			System.out.println("La clave " + claveBuscada + " no está en la tabla.");
		}

		// Se permite eliminar una clave
		System.out.print("\n¿Deseas eliminar una clave? Ingresa la clave: ");
		int claveEliminar = teclado.nextInt();
		if (tabla.eliminar(claveEliminar)) {
			System.out.println("La clave " + claveEliminar + " fue eliminada.");
		} else {
			System.out.println("La clave " + claveEliminar + " no se encontró.");
		}

		// Se muestra la tabla actualizada
		tabla.mostrar();
		teclado.close();
	}
}
