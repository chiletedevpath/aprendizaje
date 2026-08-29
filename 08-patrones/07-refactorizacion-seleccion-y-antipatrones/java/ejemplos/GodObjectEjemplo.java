public class GodObjectEjemplo {

    static class Calculador { double total(double v){return v*1.18;} }
    static class Notificador { void enviar(){System.out.println("Aviso");} }
    public static void main(String[] args) {
        // Separar responsabilidades reduce motivos de cambio dentro de una sola clase gigante.
        System.out.println(new Calculador().total(100)); new Notificador().enviar();
    }
}
