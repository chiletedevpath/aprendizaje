public class TiposYConversiones {
    public static void main(String[] args) {
        String textoEdad = "21";

        // parseInt transforma texto numérico en int. Puede fallar si el texto no representa un entero.
        int edad = Integer.parseInt(textoEdad);
        double promedio = 17.75;

        // El casting a int descarta la parte decimal; no redondea.
        int parteEntera = (int) promedio;
        boolean mayorEdad = edad >= 18;

        System.out.println("Edad: " + edad);
        System.out.println("Parte entera del promedio: " + parteEntera);
        System.out.println("¿Es mayor de edad?: " + mayorEdad);
    }
}
