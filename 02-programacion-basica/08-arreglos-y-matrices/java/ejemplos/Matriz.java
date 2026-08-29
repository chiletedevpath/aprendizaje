public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2}, {3, 4}};

        // Dos bucles permiten recorrer filas y columnas.
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
