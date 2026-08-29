public class SeparacionResponsabilidades {
    static class CalculadoraPrecio { double total(double precio,int cantidad){return precio*cantidad;} }
    static class Presentador { void mostrar(double total){System.out.printf("Total: %.2f%n",total);} }
    public static void main(String[] args){ CalculadoraPrecio c=new CalculadoraPrecio(); new Presentador().mostrar(c.total(20,3)); }
}
