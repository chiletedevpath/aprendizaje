package estructuras_datos.arbol_binario_tickets;

// Nodo del arbol binario. Cada nodo guarda un TAD TicketSoporte.
class NodoTicket {
    // Dato principal almacenado en el nodo.
    private final TicketSoporte ticket;

    // Referencia al hijo izquierdo del nodo.
    private NodoTicket izquierdo;

    // Referencia al hijo derecho del nodo.
    private NodoTicket derecho;

    // Constructor del nodo. Al inicio no tiene hijos, por eso apuntan a null.
    public NodoTicket(TicketSoporte ticket) {
        if (ticket == null) {
            throw new IllegalArgumentException("El ticket del nodo es obligatorio.");
        }
        this.ticket = ticket;
    }

    public TicketSoporte getTicket() {
        return ticket;
    }

    public NodoTicket getIzquierdo() {
        return izquierdo;
    }

    public NodoTicket getDerecho() {
        return derecho;
    }

    public void conectarIzquierdo(NodoTicket izquierdo) {
        this.izquierdo = izquierdo;
    }

    public void conectarDerecho(NodoTicket derecho) {
        this.derecho = derecho;
    }
}
