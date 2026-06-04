import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

	public static void main(String[] args) {
		List<FiguraGeometrica> lista2 = new LinkedList<FiguraGeometrica>();

		lista2.add(new FiguraGeometrica(1, "circulo"));
		lista2.add(new FiguraGeometrica(2, "cuadrado"));
		lista2.add(new FiguraGeometrica(3, "triangulo"));

		// distinto: se agrego la posicion 0
		lista2.add(0, new FiguraGeometrica(4, "rectangulo"));

		System.out.println("Impresion con integracion");

		for (FiguraGeometrica figura1 : lista2) {
			System.out.println(figura1.getNombre());
		}
	}
}

