public class FlyweightSolucion {

    record Estilo(String fuente, int tamano) {}
    static class FabricaEstilos {
        private final java.util.Map<String,Estilo> cache=new java.util.HashMap<>();
        Estilo obtener(String clave){ return cache.computeIfAbsent(clave,k->new Estilo("Inter",14)); }
    }
    public static void main(String[] args) {
        // Flyweight comparte estado inmutable repetido entre muchos objetos consumidores.
        FabricaEstilos f=new FabricaEstilos(); System.out.println(f.obtener("base")==f.obtener("base"));
    }
}
