public class IteratorSolucion {

    static class Ruta implements Iterable<String> {
        private final java.util.List<String> temas=java.util.List.of("POO","Patrones");
        public java.util.Iterator<String> iterator(){return temas.iterator();}
    }
    public static void main(String[] args) {
        // Iterator permite recorrer sin exponer cómo se almacenan internamente los elementos.
        for(String tema:new Ruta()) System.out.println(tema);
    }
}
