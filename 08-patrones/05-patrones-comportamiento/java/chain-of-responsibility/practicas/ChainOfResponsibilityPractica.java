public class ChainOfResponsibilityPractica {

    static abstract class Validador {
        private Validador siguiente; Validador enlazar(Validador s){siguiente=s;return s;}
        final boolean validar(int valor){ return revisar(valor) && (siguiente==null || siguiente.validar(valor)); }
        abstract boolean revisar(int valor);
    }
    static class Positivo extends Validador { boolean revisar(int v){return v>0;} }
    static class Maximo extends Validador { boolean revisar(int v){return v<=100;} }
    public static void main(String[] args) {
        // Cada manejador procesa su regla y delega al siguiente solo si corresponde.
        Validador a=new Positivo(); a.enlazar(new Maximo()); System.out.println(a.validar(50));
    }
}
