public class PromedioConCasting {

    public static void main(String[] args) {
        int notaUno = 15;
        int notaDos = 18;
        int notaTres = 16;

        double promedioCorrecto = (notaUno + notaDos + notaTres) / 3.0;
        int promedioEntero = (int) promedioCorrecto;

        System.out.printf("Promedio decimal: %.2f%n", promedioCorrecto);
        System.out.println("Promedio convertido a entero: " + promedioEntero);
    }
}
