package estructuras_datos.arbol_binario_tickets;

// TAD que representa la informacion de una categoria de ticket dentro del arbol.
class TicketSoporte {
    // Codigo usado para identificar la categoria del ticket.
    private final int codigo;

    // Nombre de la categoria que se mostrara durante el recorrido.
    private final String categoria;

    // Persona o area responsable de atender esta categoria.
    private final String responsable;

    // Nivel de importancia asignado a la categoria.
    private final String prioridad;

    // Constructor que inicializa los datos del TAD TicketSoporte.
    public TicketSoporte(int codigo, String categoria, String responsable, String prioridad) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("El código debe ser positivo.");
        }
        if (categoria == null || categoria.isBlank()
                || responsable == null || responsable.isBlank()
                || prioridad == null || prioridad.isBlank()) {
            throw new IllegalArgumentException("Los datos textuales del ticket son obligatorios.");
        }
        this.codigo = codigo;
        this.categoria = categoria.trim();
        this.responsable = responsable.trim();
        this.prioridad = prioridad.trim();
    }

    // Devuelve los datos del ticket en un formato entendible para la salida del recorrido.
    @Override
    public String toString() {
        return "Codigo: " + codigo
                + " | Categoria: " + categoria
                + " | Responsable: " + responsable
                + " | Prioridad: " + prioridad;
    }
}
