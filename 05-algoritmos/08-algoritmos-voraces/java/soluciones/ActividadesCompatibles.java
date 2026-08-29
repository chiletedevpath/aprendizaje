import java.util.Arrays;

public class ActividadesCompatibles {
    record Actividad(int inicio, int fin) {}

    public static void main(String[] args) {
        Actividad[] actividades = {new Actividad(1,4), new Actividad(3,5), new Actividad(0,6), new Actividad(5,7), new Actividad(8,9)};
        Arrays.sort(actividades, (a,b) -> Integer.compare(a.fin(), b.fin()));

        int ultimoFin = Integer.MIN_VALUE;
        for (Actividad a : actividades) {
            // Elegir la actividad que termina antes deja más espacio para las siguientes.
            if (a.inicio() >= ultimoFin) {
                System.out.println(a);
                ultimoFin = a.fin();
            }
        }
    }
}
