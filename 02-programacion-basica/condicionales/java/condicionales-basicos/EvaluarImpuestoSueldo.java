import java.util.Scanner;

// ESTRUCTURA SIMPLE (CONDICION SI)

public class EvaluarImpuestoSueldo {
	
	public static void main(String [] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			
			System.out.println("Ingrese su sueldo: ");
			double sueldo = entrada.nextDouble();
			
			if (sueldo > 3000) {
				
				System.out.print("Debe abonar");
				
				// ESTRUCTURA DOBLE (CONDICION SI O SINO)	
				
			}else {
				
				System.out.println("No debe abonar");
			
			}
			
			System.out.println("Buen ejercicio");
		}
	}
	
}

