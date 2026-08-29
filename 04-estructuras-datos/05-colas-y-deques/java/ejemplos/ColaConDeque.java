import java.util.ArrayDeque;
import java.util.Deque;

public class ColaConDeque {
    public static void main(String[] args) {
        Deque<String> cola = new ArrayDeque<>();

        // offerLast agrega al final y pollFirst retira desde el inicio: comportamiento FIFO.
        cola.offerLast("T-001");
        cola.offerLast("T-002");
        cola.offerLast("T-003");

        System.out.println("Atender: " + cola.pollFirst());
        System.out.println("Siguiente: " + cola.peekFirst());
    }
}
