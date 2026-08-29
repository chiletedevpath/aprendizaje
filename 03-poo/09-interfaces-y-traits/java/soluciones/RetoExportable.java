public class RetoExportable {
    interface Exportable { String exportar(); }
    static class ReporteCsv implements Exportable { public String exportar(){ return "datos,csv"; } }
    static class ReporteJson implements Exportable { public String exportar(){ return "{\"datos\":true}"; } }
    public static void main(String[] args){ Exportable[] reportes={new ReporteCsv(),new ReporteJson()}; for(Exportable r:reportes) System.out.println(r.exportar()); }
}
