package patrones.estructurales.bridge.figuras_colores;

public class Circulo extends Figura {

    public Circulo(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Circulo de color " + color.aplicarColor());
    }
}
