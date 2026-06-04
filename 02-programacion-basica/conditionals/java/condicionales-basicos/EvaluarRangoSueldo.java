import java.util.Scanner;

public class EvaluarRangoSueldo {
	
	// ESTRUCTURA MUY PARECIDA A LA ANIDADA DEL PSEINT... RECORDAR LA LOGICA DEL SI O SINO (UNE A LOS DOS)
    // JAVA RECONOCE LAS MAYUSCULAS Y MINUSCULAS
	
	public static void main(String [] args) {
		try (Scanner entrada = new Scanner(System.in)){ // EL TRY SIEMPRE DEBE ESTAR CON LLAVE 
			
			System.out.println("SISTEMA DE SUELDOS 2025");
			System.out.println(" ");
		
			System.out.print("Ingrese su sueldo: ");
			double sueldo  = entrada.nextDouble();
			
			if (sueldo > 10000) {
				System.out.println ("Tiene un buen sueldo");
				
			}else if (sueldo >= 3000 && sueldo < 8000) {
				System.out.println(" ");
				System.out.println("Su sueldo es aceptable");
				
				}else if (sueldo >= 10000 && sueldo < 3000) {
					System.out.println(" ");
					System.out.println("Debe pensar en pedir aumento");
				}else {
					System.out.println(" ");
					System.out.println("Debe buscar un mejor trabajo");
				}
							
		}
		
	}

}
