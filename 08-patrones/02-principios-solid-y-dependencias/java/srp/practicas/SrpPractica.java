public class SrpPractica {

    static class CalculadorReporte { String generar() { return "reporte"; } }
    static class GuardadorReporte { void guardar(String r) { System.out.println("Guardado: " + r); } }
    public static void main(String[] args) {
        // Cada clase concentra un motivo principal para cambiar.
        String r = new CalculadorReporte().generar();
        new GuardadorReporte().guardar(r);
    }
}
