public class MediatorEjemplo {

    interface Mediador { void enviar(String origen,String mensaje); }
    static class Sala implements Mediador { public void enviar(String o,String m){System.out.println(o+": "+m);} }
    static class Usuario { String nombre; Mediador m; Usuario(String n,Mediador m){nombre=n;this.m=m;} void hablar(String t){m.enviar(nombre,t);} }
    public static void main(String[] args) {
        // Mediator concentra la coordinación y evita referencias directas entre participantes.
        new Usuario("Ana",new Sala()).hablar("Hola");
    }
}
