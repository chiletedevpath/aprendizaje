import java.util.ArrayDeque;
import java.util.Queue;

public class ColaTickets {
    public static void main(String[] args) {
        Queue<String> tickets = new ArrayDeque<>();
        tickets.offer("T-101"); tickets.offer("T-102"); tickets.offer("T-103");
        // poll procesa el ticket más antiguo sin romper el orden FIFO.
        while (!tickets.isEmpty()) System.out.println("Atendiendo " + tickets.poll());
    }
}
