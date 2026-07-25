import java.util.LinkedList;

public class EjemploLinkedList {

	public static void main(String[] args) {
		LinkedList<FiguraGeometrica> figuras = new LinkedList<>();

		figuras.add(new FiguraGeometrica(1, "Circulo"));
		figuras.add(new FiguraGeometrica(2, "Cuadrado"));
		figuras.add(new FiguraGeometrica(3, "Triangulo"));

		// LinkedList permite operar directamente sobre ambos extremos.
		figuras.addFirst(new FiguraGeometrica(4, "Rectangulo"));
		FiguraGeometrica figuraRetirada = figuras.removeLast();

		System.out.println("Elemento retirado del final: " + figuraRetirada);
		System.out.println("Recorrido de LinkedList con for-each:");

		for (FiguraGeometrica figura : figuras) {
			System.out.println(figura);
		}
	}
}
