public class OcpPractica {

    interface Descuento { double aplicar(double total); }
    static class Vip implements Descuento { public double aplicar(double t) { return t * 0.85; } }
    static class Regular implements Descuento { public double aplicar(double t) { return t; } }
    static double total(double monto, Descuento descuento) { return descuento.aplicar(monto); }
    public static void main(String[] args) {
        // Una nueva estrategia extiende el comportamiento sin modificar total().
        System.out.println(total(100, new Vip()));
    }
}
