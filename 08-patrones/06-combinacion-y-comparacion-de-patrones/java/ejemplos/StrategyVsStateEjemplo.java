public class StrategyVsStateEjemplo {

    interface Estrategia { int calcular(int valor); }
    static class Doble implements Estrategia { public int calcular(int v){return v*2;} }
    static class ContextoStrategy { Estrategia e; ContextoStrategy(Estrategia e){this.e=e;} }

    interface Estado { String ejecutar(); }
    static class Activo implements Estado { public String ejecutar(){return "activo";} }

    public static void main(String[] args) {
        // Strategy representa una política elegible; State representa comportamiento ligado al estado interno.
        System.out.println(new ContextoStrategy(new Doble()).e.calcular(5));
        System.out.println(new Activo().ejecutar());
    }
}
