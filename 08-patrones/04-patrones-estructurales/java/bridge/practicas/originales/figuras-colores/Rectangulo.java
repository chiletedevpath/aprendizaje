package patrones.estructurales.bridge.figuras_colores;

public class Rectangulo extends Figura {

    public Rectangulo(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Rectangulo de color " + color.aplicarColor());
    }
}
