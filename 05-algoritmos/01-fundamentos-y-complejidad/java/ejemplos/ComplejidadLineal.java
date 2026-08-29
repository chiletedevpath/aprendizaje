public class ComplejidadLineal {
    static boolean contiene(int[] datos, int buscado) {
        // En el peor caso se revisa cada elemento una vez: O(n).
        for (int dato : datos) {
            if (dato == buscado) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] datos = {4, 8, 15, 16, 23, 42};
        System.out.println(contiene(datos, 23));
    }
}
