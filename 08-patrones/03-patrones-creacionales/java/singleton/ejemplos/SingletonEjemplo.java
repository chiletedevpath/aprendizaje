public class SingletonEjemplo {

    static final class Configuracion {
        private static final Configuracion INSTANCIA = new Configuracion();
        private Configuracion() {}
        static Configuracion instancia() { return INSTANCIA; }
    }
    public static void main(String[] args) {
        // El constructor privado impide crear instancias libremente desde fuera.
        System.out.println(Configuracion.instancia() == Configuracion.instancia());
    }
}
