public class CompositePractica {

    interface Recurso { int cantidad(); }
    static class Archivo implements Recurso { public int cantidad(){return 1;} }
    static class Carpeta implements Recurso {
        java.util.List<Recurso> hijos = new java.util.ArrayList<>();
        void agregar(Recurso r){hijos.add(r);} public int cantidad(){return hijos.stream().mapToInt(Recurso::cantidad).sum();}
    }
    public static void main(String[] args) {
        // Composite permite tratar un elemento individual y un grupo mediante el mismo contrato.
        Carpeta c=new Carpeta(); c.agregar(new Archivo()); c.agregar(new Archivo()); System.out.println(c.cantidad());
    }
}
