package estructuras_datos.arbol_binario_tickets;

// Clase que administra el arbol binario y ejecuta el recorrido.
class ArbolBinarioTickets {
    // La raiz es el primer nodo desde donde inicia el recorrido.
    private final NodoTicket raiz;

    // Recibe la raiz ya creada para formar el arbol binario.
    public ArbolBinarioTickets(NodoTicket raiz) {
        this.raiz = raiz;
    }

    // Metodo publico que inicia el recorrido preorden.
    public String recorrerPreOrden() {
        // Acumula el resultado para mostrarlo al final.
        StringBuilder recorridoGenerado = new StringBuilder();

        // El recorrido inicia desde la raiz en el nivel 0.
        recorrerPreOrdenDesde(raiz, 0, recorridoGenerado);

        return recorridoGenerado.toString();
    }

    // Metodo recursivo que recorre el arbol: nodo actual, izquierda y derecha.
    private void recorrerPreOrdenDesde(NodoTicket nodoActual, int nivel, StringBuilder recorridoGenerado) {
        // Caso base: si la referencia es null, esa rama ya termino.
        if (nodoActual == null) {
            return;
        }

        // En preorden primero se visita el nodo actual.
        agregarTicketVisitado(nodoActual.getTicket(), nivel, recorridoGenerado);

        // Luego se recorre la rama izquierda aumentando el nivel.
        recorrerPreOrdenDesde(nodoActual.getIzquierdo(), nivel + 1, recorridoGenerado);

        // Finalmente se recorre la rama derecha aumentando el nivel.
        recorrerPreOrdenDesde(nodoActual.getDerecho(), nivel + 1, recorridoGenerado);
    }

    // Agrega al resultado el ticket visitado respetando su nivel en el arbol.
    private void agregarTicketVisitado(TicketSoporte ticket, int nivel, StringBuilder recorridoGenerado) {
        // Agrega espacios para que se note visualmente la jerarquia.
        for (int i = 0; i < nivel; i++) {
            recorridoGenerado.append("  ");
        }

        // Guarda la informacion del nodo visitado dentro del recorrido final.
        recorridoGenerado.append("- ")
                .append(ticket)
                .append(System.lineSeparator());
    }
}
