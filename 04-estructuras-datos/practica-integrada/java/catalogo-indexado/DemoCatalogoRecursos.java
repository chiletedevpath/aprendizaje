public class DemoCatalogoRecursos {

    public static void main(String[] args) {
        CatalogoRecursos catalogo = new CatalogoRecursos(5);

        catalogo.registrar(new Recurso(10, "Guía de listas", "Lectura"));
        catalogo.registrar(new Recurso(15, "Práctica de tablas hash", "Ejercicio"));
        catalogo.registrar(new Recurso(22, "Árbol binario", "Laboratorio"));

        boolean duplicadoAceptado = catalogo.registrar(
                new Recurso(10, "Recurso duplicado", "Ejercicio"));
        System.out.println("Duplicado aceptado: " + duplicadoAceptado);

        System.out.println("Consulta 15: " + catalogo.buscar(15));
        System.out.println("Consulta 99: " + catalogo.buscar(99));

        catalogo.eliminar(10);
        System.out.println("\nOrden final:");
        catalogo.mostrarEnOrden();
    }
}
