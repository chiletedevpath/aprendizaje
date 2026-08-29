public class StateEjemplo {

    interface Estado { void avanzar(Contexto c); }
    static class Pendiente implements Estado { public void avanzar(Contexto c){c.estado=new Publicado();} }
    static class Publicado implements Estado { public void avanzar(Contexto c){System.out.println("Sin transición");} }
    static class Contexto { Estado estado=new Pendiente(); void avanzar(){estado.avanzar(this);} }
    public static void main(String[] args) {
        // State delega el comportamiento al objeto que representa el estado actual.
        Contexto c=new Contexto(); c.avanzar(); System.out.println(c.estado.getClass().getSimpleName());
    }
}
