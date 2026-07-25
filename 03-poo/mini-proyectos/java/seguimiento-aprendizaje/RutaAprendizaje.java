public final class RutaAprendizaje {
    private final String nombre;
    private final Actividad[] actividades;

    public RutaAprendizaje(String nombre, Actividad[] actividades) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la ruta es obligatorio.");
        }
        if (actividades == null || actividades.length == 0) {
            throw new IllegalArgumentException("La ruta debe contener actividades.");
        }
        for (Actividad actividad : actividades) {
            if (actividad == null) {
                throw new IllegalArgumentException("Las actividades no pueden ser nulas.");
            }
        }
        this.nombre = nombre.trim();
        this.actividades = actividades.clone();
    }

    public void mostrarReporte() {
        double puntajeObtenido = 0;
        double puntajeMaximo = 0;

        System.out.println("Ruta: " + nombre);
        for (Actividad actividad : actividades) {
            double puntaje = actividad.calcularPuntaje();
            puntajeObtenido += puntaje;
            puntajeMaximo += actividad.getPuntajeMaximo();
            System.out.printf("- %s: %.2f de %.2f%n",
                    actividad.getTitulo(), puntaje, actividad.getPuntajeMaximo());
        }

        System.out.printf("Avance global: %.2f%%%n", puntajeObtenido * 100 / puntajeMaximo);
    }
}
