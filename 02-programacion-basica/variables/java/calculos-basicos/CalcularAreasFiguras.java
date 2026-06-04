import java.util.Scanner;

/* EJERCICIO 1: ESCRIBIR UN PROGRAMA QUE CALCULE EL ÁREA DE UNA FIGURA GEOMÉTRICA CUALQUIERA. 
 * EJEMPLO AREA DEL CUADRADO Y TRIANGULO */

public class CalcularAreasFiguras {

	public static void main(String[] args) {

		System.out.println("**  AREAS DE FIGURAS GEOMETRICAS  **");
		System.out.println("************************************");
		System.out.println();
		
		System.out.print("Ingrese el nombre de la figura: ");
		
		try (Scanner scanner = new Scanner(System.in)) {
			String figura = scanner.next();

			if (figura.equalsIgnoreCase("cuadrado")) {

				System.out.print("Ingrese la medida del lado del cuadrado: ");
				double ladoCuadrado = scanner.nextDouble();

				if (ladoCuadrado > 0) {
					double areaCuadrado = ladoCuadrado * ladoCuadrado;
					System.out.println();
					System.out.println("El area del cuadrado es: " + areaCuadrado);
				} else {
					System.out.println();
					System.out.println("Ingrese una medida correcta");
				}

			} else if (figura.equalsIgnoreCase("triangulo")) {
				System.out.print("Ingrese la medida de la base de su triangulo: ");
				double baseTriangulo = scanner.nextDouble();

				System.out.print("Ingrese la medida de la altura de su triangulo: ");
				double alturaTriangulo = scanner.nextDouble();

				if (baseTriangulo > 0 && alturaTriangulo > 0) {
					double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
					System.out.println();
					System.out.println("El área del triángulo es: " + areaTriangulo);
				} else {
					System.out.println();
					System.out.println("Ingrese medidas correctas");
				}

			} else {
				System.out.println();
				System.out.println("Nombre de figura no reconocida");
			}
		}
	}
}
