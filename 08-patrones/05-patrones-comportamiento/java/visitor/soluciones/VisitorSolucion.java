public class VisitorSolucion {

    interface Elemento { void aceptar(Visitante v); }
    static class Curso implements Elemento { public void aceptar(Visitante v){v.visitar(this);} }
    interface Visitante { void visitar(Curso c); }
    static class Exportador implements Visitante { public void visitar(Curso c){System.out.println("Exportando curso");} }
    public static void main(String[] args) {
        // Visitor agrega una operación sin modificar la clase del elemento visitado.
        new Curso().aceptar(new Exportador());
    }
}
