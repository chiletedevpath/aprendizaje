public class ConversionesTiposDatos {
    public static void main(String[] args) {
        int numero = 100000;

        // Conversion explicita: puede perder informacion si el tipo destino es menor.
        byte numeroConvertido = (byte) numero;
        System.out.println("Valor original (int): " + numero);
        System.out.println("Conversion explicita a byte: " + numeroConvertido);

        // Conversion implicita: Java la permite cuando el tipo destino tiene mayor capacidad.
        double numeroDecimal = numero;
        System.out.println("Conversion implicita a double: " + numeroDecimal);
    }
}
