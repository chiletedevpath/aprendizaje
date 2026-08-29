public class SingletonGlobalEjemplo {

    public static void main(String[] args) {
        // Un Singleton mutable compartido introduce estado global y puede dificultar pruebas aisladas.
        System.out.println("Evita usar Singleton como contenedor global de estado mutable.");
    }
}
