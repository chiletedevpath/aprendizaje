public class DipPractica {

    interface Repositorio { void guardar(String dato); }
    static class MemoriaRepositorio implements Repositorio { public void guardar(String d) { System.out.println("Memoria: " + d); } }
    static class Servicio {
        private final Repositorio repositorio;
        Servicio(Repositorio repositorio) { this.repositorio = repositorio; }
        void registrar(String dato) { repositorio.guardar(dato); }
    }
    public static void main(String[] args) {
        // La lógica de alto nivel depende del contrato Repositorio, no de una base concreta.
        new Servicio(new MemoriaRepositorio()).registrar("evento");
    }
}
