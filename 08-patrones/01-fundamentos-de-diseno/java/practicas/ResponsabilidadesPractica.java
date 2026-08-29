public class ResponsabilidadesPractica {

    static class Reporte {
        String contenido() { return "avance=80%"; }
    }

    static class ExportadorArchivo {
        void guardar(Reporte reporte) {
            // La escritura se separa del objeto que representa el reporte.
            System.out.println("Guardando " + reporte.contenido());
        }
    }

    public static void main(String[] args) {
        new ExportadorArchivo().guardar(new Reporte());
    }
}
