import java.util.TreeSet;

public class RegistroCodigosBst {
    public static void main(String[] args) {
        TreeSet<Integer> codigos = new TreeSet<>();
        codigos.addAll(java.util.List.of(50, 30, 70, 20, 40));
        // TreeSet mantiene los valores ordenados mediante una estructura de árbol balanceada.
        System.out.println(codigos);
        System.out.println("Menor: " + codigos.first() + ", mayor: " + codigos.last());
    }
}
