import java.util.Scanner;

public class CalcularAreaFiguraCondicional {
	
	
	
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("De que figura desea calcular el area (cuadrado, rectangulo, triangulo y circulo)");
        String figura = entrada.nextLine().toLowerCase();
        double area=0;
        
        if(figura.contains("cua")){
            System.out.println("Ingrese el lado del cuadrado");
            double lado = entrada.nextDouble();
            area = lado*lado;
            
        }else if(figura.contains("tri")){
            System.out.println("Ingrese la base del triangulo");
            double base = entrada.nextDouble();

            System.out.println("Ingrese la altura del triangulo");
            double altura = entrada.nextDouble();
            
            area = (base * altura)/2;
            
        }else if(figura.contains("rec")){
            System.out.println("Ingrese el largo del rectangulo");
            double largo = entrada.nextDouble();

            System.out.println("Ingrese el ancho del triangulo");
            double ancho = entrada.nextDouble();
            
            area = largo * ancho;
            
        }else if(figura.contains("cir")){
            System.out.println("Ingrese el radio del circulo");
            double radio = entrada.nextDouble();
            
            area = Math.PI * radio * radio;
            //Math.pow(area, area)
        }else{
            
        }
  
        
        System.out.printf("El area de la figura ingresada es %.2f %n", area);
        
        entrada.close();
    }
	

}
