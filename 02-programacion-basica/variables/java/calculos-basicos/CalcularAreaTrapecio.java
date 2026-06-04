import java.util.Scanner;

/* EJERCICIO 2: ESCRIBIR UN PROGRAMA QUE RESUELVA UNA FÓRMULA MATEMÁTICA QUE UTILICE AL MENOS 3 VARIABLES.
 * EJEMPLO: FORMULA DEL AREA DE UN TRAPECIO = ((B1+B2)/2 * h))*/

public class CalcularAreaTrapecio {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
   
			
			System.out.println("** FORMULA DEL AREA DEL TRAPECIO **");
			System.out.println("*******************************************");
			
			System.out.println("Ingrese la medida de la base mayor (B1): ");
			double baseMayor = scanner.nextDouble();
			
			System.out.println("Ingrese la medida de la base menor (B2): ");
			double baseMenor = scanner.nextDouble();
			
			System.out.println("Ingrese la medida de la altura: ");
			double altura = scanner.nextDouble();
					
			double areaTrapecio = ((baseMayor + baseMenor) / 2) * altura;
			
			if (baseMayor > 0 && baseMenor > 0 && altura > 0) {
				System.out.println("El area del trapecio es: " + areaTrapecio);	
			} else {
				System.out.println("Ingrese medida correctas");	
			}
		}
	}
}
