public class ClaseAbstracta {
    static abstract class Figura {
        abstract double area();
    }
    static class Cuadrado extends Figura {
        final double lado;
        Cuadrado(double lado){this.lado=lado;}
        @Override double area(){return lado*lado;}
    }
    public static void main(String[] args){ System.out.println(new Cuadrado(4).area()); }
}
