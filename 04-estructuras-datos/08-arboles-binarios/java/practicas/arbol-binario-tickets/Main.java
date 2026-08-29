package estructuras_datos.arbol_binario_tickets;

public class Main {
    public static void main(String[] args) {
        // Nodo raiz del arbol: representa la categoria principal del caso.
        NodoTicket mesaAyuda = new NodoTicket(
                new TicketSoporte(100, "Mesa de ayuda", "Chilete DevPath", "Alta"));

        // Nodos del segundo nivel: dos ramas principales del arbol binario.
        NodoTicket software = new NodoTicket(
                new TicketSoporte(110, "Incidencias de software", "Equipo de software", "Media"));

        NodoTicket hardware = new NodoTicket(
                new TicketSoporte(120, "Incidencias de hardware", "Equipo de soporte", "Media"));

        // Nodos hijos de la rama izquierda: categorias derivadas de software.
        NodoTicket sistemaInterno = new NodoTicket(
                new TicketSoporte(111, "Sistema interno", "Responsable A", "Alta"));

        NodoTicket aplicacionWeb = new NodoTicket(
                new TicketSoporte(112, "Portal de aprendizaje", "Responsable B", "Media"));

        // Nodos hijos de la rama derecha: categorias derivadas de hardware.
        NodoTicket equipoLento = new NodoTicket(
                new TicketSoporte(121, "Equipo lento", "Responsable C", "Baja"));

        NodoTicket impresora = new NodoTicket(
                new TicketSoporte(122, "Equipo sin conexión", "Responsable D", "Media"));

        // Enlaces de la raiz hacia sus dos hijos.
        mesaAyuda.conectarIzquierdo(software);
        mesaAyuda.conectarDerecho(hardware);

        // Enlaces de la rama izquierda del arbol.
        software.conectarIzquierdo(sistemaInterno);
        software.conectarDerecho(aplicacionWeb);

        // Enlaces de la rama derecha del arbol.
        hardware.conectarIzquierdo(equipoLento);
        hardware.conectarDerecho(impresora);

        // Se crea el arbol usando como punto de inicio la raiz.
        ArbolBinarioTickets arbolTickets = new ArbolBinarioTickets(mesaAyuda);

        // Ejecucion de la operacion solicitada: recorrido de un arbol binario.
        System.out.println("Recorrido preorden del arbol binario de tickets:");
        System.out.println(arbolTickets.recorrerPreOrden());
    }
}
