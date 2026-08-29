import java.util.Scanner;

public class CalculadoraDevPath {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Calculadora Chilete DevPath");
            System.out.print("Ingrese el primer numero: ");
            double numeroUno = teclado.nextDouble();

            System.out.print("Ingrese el segundo numero: ");
            double numeroDos = teclado.nextDouble();

            System.out.printf("Suma: %.2f%n", sumar(numeroUno, numeroDos));
            System.out.printf("Resta: %.2f%n", restar(numeroUno, numeroDos));
            System.out.printf("Multiplicacion: %.2f%n", multiplicar(numeroUno, numeroDos));

            if (numeroDos == 0) {
                System.out.println("Division: no se puede dividir entre cero.");
            } else {
                System.out.printf("Division: %.2f%n", dividir(numeroUno, numeroDos));
            }
        }
    }

    static double sumar(double numeroUno, double numeroDos) {
        return numeroUno + numeroDos;
    }

    static double restar(double numeroUno, double numeroDos) {
        return numeroUno - numeroDos;
    }

    static double multiplicar(double numeroUno, double numeroDos) {
        return numeroUno * numeroDos;
    }

    static double dividir(double numeroUno, double numeroDos) {
        return numeroUno / numeroDos;
    }
}
