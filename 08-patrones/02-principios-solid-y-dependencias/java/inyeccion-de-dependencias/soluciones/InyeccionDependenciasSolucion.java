public class InyeccionDependenciasSolucion {

    interface Reloj { long ahora(); }
    static class RelojSistema implements Reloj { public long ahora() { return System.currentTimeMillis(); } }
    static class Auditor {
        private final Reloj reloj;
        Auditor(Reloj reloj) { this.reloj = reloj; }
        void registrar() { System.out.println(reloj.ahora()); }
    }
    public static void main(String[] args) {
        // El constructor hace explícita la dependencia y permite sustituirla en pruebas.
        new Auditor(new RelojSistema()).registrar();
    }
}
