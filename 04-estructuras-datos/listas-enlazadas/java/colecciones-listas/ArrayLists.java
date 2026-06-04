import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
	
	public static void main(String[] args) {
		List<FiguraGeometrica> lista1 = new ArrayList<FiguraGeometrica>();

		lista1.add(new FiguraGeometrica(1, "circulo"));
		lista1.add(new FiguraGeometrica(2, "cuadrado"));
		lista1.add(new FiguraGeometrica(3, "triangulo"));

		System.out.println("Impresion con integracion");

		for (int i = 0; i < lista1.size(); i++) {
			System.out.println(lista1.get(i).getNombre());
		}

	}
}

