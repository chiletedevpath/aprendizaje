public class MetodosBasicos {
    // Este método solo calcula y devuelve un resultado; no imprime.
    static double calcularPromedio(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    static String clasificar(double promedio) {
        return promedio >= 11 ? "Aprobado" : "Desaprobado";
    }

    public static void main(String[] args) {
        double promedio = calcularPromedio(14, 16, 18);
        System.out.printf("Promedio: %.2f | %s%n", promedio, clasificar(promedio));
    }
}
