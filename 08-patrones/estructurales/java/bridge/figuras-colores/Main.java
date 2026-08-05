package patrones.estructurales.bridge.figuras_colores;

public class Main {

    public static void main(String[] args) {

        Figura f1 = new Circulo(new Rojo());
        Figura f2 = new Rectangulo(new Azul());
        Figura f3 = new Circulo(new Azul());
        Figura f4 = new Rectangulo(new Rojo());

        f1.dibujar();
        f2.dibujar();
        f3.dibujar();
        f4.dibujar();
    }
}