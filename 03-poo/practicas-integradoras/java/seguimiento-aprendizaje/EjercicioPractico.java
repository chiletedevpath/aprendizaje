public final class EjercicioPractico extends Actividad {
    private final int pruebasSuperadas;
    private final int pruebasTotales;

    public EjercicioPractico(String titulo, double puntajeMaximo, int pruebasSuperadas, int pruebasTotales) {
        super(titulo, puntajeMaximo);
        if (pruebasTotales <= 0) {
            throw new IllegalArgumentException("Debe existir al menos una prueba.");
        }
        if (pruebasSuperadas < 0 || pruebasSuperadas > pruebasTotales) {
            throw new IllegalArgumentException("La cantidad de pruebas superadas es inválida.");
        }
        this.pruebasSuperadas = pruebasSuperadas;
        this.pruebasTotales = pruebasTotales;
    }

    @Override
    public double calcularPuntaje() {
        return getPuntajeMaximo() * pruebasSuperadas / pruebasTotales;
    }
}
