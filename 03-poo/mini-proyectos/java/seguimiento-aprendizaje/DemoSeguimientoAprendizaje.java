public class DemoSeguimientoAprendizaje {

    public static void main(String[] args) {
        Actividad[] actividades = {
                new Lectura("Fundamentos de POO", 20, 80),
                new EjercicioPractico("Modelado de clases", 30, 8, 10)
        };

        RutaAprendizaje ruta = new RutaAprendizaje("Programación orientada a objetos", actividades);
        ruta.mostrarReporte();
    }
}
