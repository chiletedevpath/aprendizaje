import java.util.Objects;
public class ProductoIgualdad {
    static class Producto {
        final String codigo; final String nombre;
        Producto(String codigo,String nombre){this.codigo=codigo;this.nombre=nombre;}
        @Override public boolean equals(Object o){return o instanceof Producto p && Objects.equals(codigo,p.codigo);}
        @Override public int hashCode(){return Objects.hash(codigo);}
        @Override public String toString(){return codigo+" - "+nombre;}
    }
    public static void main(String[] args){ System.out.println(new Producto("P1","A").equals(new Producto("P1","B"))); }
}
