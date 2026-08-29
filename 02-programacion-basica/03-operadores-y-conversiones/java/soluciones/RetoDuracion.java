public class RetoDuracion {
    public static void main(String[] args) {
        int minutosTotales = 145;
        int horas = minutosTotales / 60;
        // % conserva los minutos que no completan una hora.
        int minutos = minutosTotales % 60;
        boolean superaDosHoras = minutosTotales > 120;

        System.out.printf("%d h %d min | supera 2 h: %s%n", horas, minutos, superaDosHoras);
    }
}
