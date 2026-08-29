public class Conversiones {
    public static void main(String[] args) {
        double promedio = 17.8;

        // El casting a int descarta la parte decimal; no redondea.
        int parteEntera = (int) promedio;
        // parseInt() convierte texto numérico a int.
        int edad = Integer.parseInt("21");

        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Edad: " + edad);
    }
}
