package patrones.estructurales.proxy.documentos;

public class Main {

    public static void main(String[] args) {

        Documento doc = new DocumentoProxy("Contrato.pdf");

        System.out.println("Aplicacion iniciada");

        doc.mostrar();
    }
}