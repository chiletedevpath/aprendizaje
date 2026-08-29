public class RetoAnalizarNotas {
    public static void main(String[] args) {
        int[] notas = {15, 18, 9, 20, 12};
        int suma = 0;
        int mayor = notas[0];
        int menor = notas[0];
        int aprobados = 0;

        for (int nota : notas) {
            suma += nota;
            if (nota > mayor) mayor = nota;
            if (nota < menor) menor = nota;
            if (nota >= 11) aprobados++;
        }

        // El casting evita una división entera al calcular el promedio.
        double promedio = (double) suma / notas.length;
        System.out.printf("Promedio: %.2f | Mayor: %d | Menor: %d | Aprobados: %d%n",
                promedio, mayor, menor, aprobados);
    }
}
