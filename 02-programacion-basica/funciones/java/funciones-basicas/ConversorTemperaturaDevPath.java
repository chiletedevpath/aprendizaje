import java.util.Scanner;

public class ConversorTemperaturaDevPath {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Conversor de temperatura Chilete DevPath");
            System.out.print("Ingrese grados Celsius: ");
            double celsius = teclado.nextDouble();

            double fahrenheit = convertirAFahrenheit(celsius);
            double kelvin = convertirAKelvin(celsius);

            System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
            System.out.printf("Kelvin: %.2f%n", kelvin);
        }
    }

    static double convertirAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double convertirAKelvin(double celsius) {
        return celsius + 273.15;
    }
}
