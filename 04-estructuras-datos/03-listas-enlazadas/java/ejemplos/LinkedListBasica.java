import java.util.LinkedList;

public class LinkedListBasica {
    public static void main(String[] args) {
        LinkedList<String> turnos = new LinkedList<>();

        // addFirst y addLast trabajan sobre los extremos de la lista enlazada.
        turnos.addLast("T-001");
        turnos.addLast("T-002");
        turnos.addFirst("URG-001");

        System.out.println(turnos);
    }
}
