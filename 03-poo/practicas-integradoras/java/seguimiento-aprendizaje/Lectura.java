public final class Lectura extends Actividad {
    private final int comprension;

    public Lectura(String titulo, double puntajeMaximo, int comprension) {
        super(titulo, puntajeMaximo);
        if (comprension < 0 || comprension > 100) {
            throw new IllegalArgumentException("La comprensión debe estar entre 0 y 100.");
        }
        this.comprension = comprension;
    }

    @Override
    public double calcularPuntaje() {
        return getPuntajeMaximo() * comprension / 100.0;
    }
}
