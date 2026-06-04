import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int elementoOrdenador = (int) (Math.random() * 3);
		String ordenador;

		if (elementoOrdenador == 0) {
			ordenador = "Piedra";
		} else if (elementoOrdenador == 1) {
			ordenador = "Papel";
		} else {
			ordenador = "Tijera";
		}

		System.out.println("Ingrese su elemento a jugar: ");
		String elementoAJugar = teclado.nextLine();

		teclado.close();

		System.out.println("Elemento del ordenador: " + ordenador);

		if (ordenador.equalsIgnoreCase(elementoAJugar)) {
			System.out.println("EMPATE");
		} else if (elementoAJugar.equalsIgnoreCase("piedra") && ordenador.equalsIgnoreCase("tijera")
				|| elementoAJugar.equalsIgnoreCase("papel") && ordenador.equalsIgnoreCase("piedra")
				|| elementoAJugar.equalsIgnoreCase("tijera") && ordenador.equalsIgnoreCase("papel")) {
			System.out.println("GANASTES");
		} else {
			System.out.println("PERDISTES");
		}
	}
}
