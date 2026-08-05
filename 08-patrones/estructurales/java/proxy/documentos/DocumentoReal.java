package patrones.estructurales.proxy.documentos;

public class DocumentoReal implements Documento {

    private String nombre;

    public DocumentoReal(String nombre) {
        this.nombre = nombre;
        cargarDocumento();
    }

    private void cargarDocumento() {
        System.out.println("Cargando documento pesado...");
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando " + nombre);
    }
}