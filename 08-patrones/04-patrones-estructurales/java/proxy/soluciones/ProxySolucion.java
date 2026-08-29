public class ProxySolucion {

    interface Documento { void abrir(); }
    static class DocumentoReal implements Documento { public void abrir(){System.out.println("Documento abierto");} }
    static class ProxyDocumento implements Documento {
        private final boolean autorizado; private final Documento real=new DocumentoReal();
        ProxyDocumento(boolean autorizado){this.autorizado=autorizado;}
        public void abrir(){ if(autorizado) real.abrir(); else System.out.println("Acceso denegado"); }
    }
    public static void main(String[] args) {
        // Proxy controla el acceso antes de delegar al objeto real.
        new ProxyDocumento(true).abrir();
    }
}
