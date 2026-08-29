public class ObserverSolucion {

    interface Observador { void actualizar(String estado); }
    static class Curso {
        java.util.List<Observador> obs=new java.util.ArrayList<>(); void agregar(Observador o){obs.add(o);} void cambiar(String e){obs.forEach(o->o.actualizar(e));}
    }
    public static void main(String[] args) {
        // Observer notifica a interesados sin acoplar Curso a tipos concretos de receptor.
        Curso c=new Curso(); c.agregar(e->System.out.println("Cambio: "+e)); c.cambiar("Publicado");
    }
}
