import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {

	public static void main(String[] args) {
		List<FiguraGeometrica> figuras = new ArrayList<>();

		figuras.add(new FiguraGeometrica(1, "Circulo"));
		figuras.add(new FiguraGeometrica(2, "Cuadrado"));
		figuras.add(new FiguraGeometrica(3, "Triangulo"));

		System.out.println("Recorrido de ArrayList por indice:");

		for (int i = 0; i < figuras.size(); i++) {
			System.out.println("Indice " + i + ": " + figuras.get(i));
		}
	}
}
