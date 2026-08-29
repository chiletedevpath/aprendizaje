public class FacadeSolucion {

    static class Autenticacion { void validar(){System.out.println("Validado");} }
    static class Repositorio { void guardar(){System.out.println("Guardado");} }
    static class FachadaCurso {
        private final Autenticacion a=new Autenticacion(); private final Repositorio r=new Repositorio();
        void publicar(){ a.validar(); r.guardar(); }
    }
    public static void main(String[] args) {
        // Facade ofrece una operación simple sobre varios componentes del subsistema.
        new FachadaCurso().publicar();
    }
}
