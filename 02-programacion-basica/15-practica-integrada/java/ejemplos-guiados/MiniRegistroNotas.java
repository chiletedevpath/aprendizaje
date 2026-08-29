import java.util.Scanner;

public class MiniRegistroNotas {
    static double promedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] notas = new double[3];

            for (int i = 0; i < notas.length; i++) {
                double nota;
                do {
                    System.out.print("Nota " + (i + 1) + " (0-20): ");
                    nota = scanner.nextDouble();
                } while (nota < 0 || nota > 20);

                notas[i] = nota;
            }

            double prom = promedio(notas);
            String estado = prom >= 11 ? "Aprobado" : "Desaprobado";
            System.out.printf("Promedio: %.2f | %s%n", prom, estado);
        }
    }
}
