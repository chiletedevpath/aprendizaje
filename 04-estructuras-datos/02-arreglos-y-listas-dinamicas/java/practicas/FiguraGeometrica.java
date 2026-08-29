public class FiguraGeometrica {
    private final int numeral;
    private final String nombre;

    public FiguraGeometrica(int numeral, String nombre) {
        if (numeral <= 0) {
            throw new IllegalArgumentException("El numeral debe ser positivo.");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        this.numeral = numeral;
        this.nombre = nombre.trim();
    }

    @Override
    public String toString() {
        return numeral + " - " + nombre;
    }
}
