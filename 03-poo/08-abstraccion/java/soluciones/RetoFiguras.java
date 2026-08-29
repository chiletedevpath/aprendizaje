public class RetoFiguras {
    static abstract class Figura { abstract double area(); }
    static class Circulo extends Figura { final double radio; Circulo(double radio){this.radio=radio;} double area(){return Math.PI*radio*radio;} }
    static class Rectangulo extends Figura { final double base, altura; Rectangulo(double b,double a){base=b;altura=a;} double area(){return base*altura;} }
    public static void main(String[] args){ Figura[] figuras={new Circulo(2),new Rectangulo(3,4)}; for(Figura f:figuras) System.out.println(f.area()); }
}
