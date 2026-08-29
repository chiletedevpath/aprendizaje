import java.util.ArrayList;
import java.util.List;

public class CostosBasicos {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        // get accede directamente a una posición de ArrayList: costo aproximado O(1).
        System.out.println("Posición 3: " + valores.get(3));

        // contains puede revisar varios elementos hasta encontrar el valor: O(n) en el peor caso.
        System.out.println("Contiene 40: " + valores.contains(40));

        // Insertar al inicio desplaza los elementos existentes: O(n).
        valores.add(0, 5);
        System.out.println(valores);
    }
}
