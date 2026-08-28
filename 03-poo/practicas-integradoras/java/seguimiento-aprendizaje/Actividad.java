public abstract class Actividad implements Evaluable {
    private final String titulo;
    private final double puntajeMaximo;

    protected Actividad(String titulo, double puntajeMaximo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("El título es obligatorio.");
        }
        if (puntajeMaximo <= 0) {
            throw new IllegalArgumentException("El puntaje máximo debe ser positivo.");
        }
        this.titulo = titulo.trim();
        this.puntajeMaximo = puntajeMaximo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPuntajeMaximo() {
        return puntajeMaximo;
    }
}
