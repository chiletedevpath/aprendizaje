public class StrategySolucion {

    interface Calculo { double aplicar(double monto); }
    static class Regular implements Calculo { public double aplicar(double m){return m;} }
    static class Vip implements Calculo { public double aplicar(double m){return m*0.9;} }
    static class Compra { Calculo estrategia; Compra(Calculo e){estrategia=e;} double total(double m){return estrategia.aplicar(m);} }
    public static void main(String[] args) {
        // Strategy permite cambiar el algoritmo sin modificar Compra.
        System.out.println(new Compra(new Vip()).total(100));
    }
}
