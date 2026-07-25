public final class Recurso {
    private final int codigo;
    private final String titulo;
    private final String tipo;

    public Recurso(int codigo, String titulo, String tipo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("El código debe ser positivo.");
        }
        if (titulo == null || titulo.isBlank() || tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("El título y el tipo son obligatorios.");
        }
        this.codigo = codigo;
        this.titulo = titulo.trim();
        this.tipo = tipo.trim();
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return codigo + " - " + titulo + " (" + tipo + ")";
    }
}
