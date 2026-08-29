public class Interfaz {
    interface Exportable { String exportar(); }
    static class Reporte implements Exportable {
        public String exportar(){ return "reporte.csv"; }
    }
    public static void main(String[] args){ System.out.println(new Reporte().exportar()); }
}
