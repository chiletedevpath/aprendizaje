package patrones.estructurales.proxy.documentos;

public class DocumentoProxy implements Documento {

    private String nombre;
    private DocumentoReal documentoReal;

    public DocumentoProxy(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        if (documentoReal == null) {
            documentoReal = new DocumentoReal(nombre);
        }

        documentoReal.mostrar();
    }
}