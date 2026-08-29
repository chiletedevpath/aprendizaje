public class EnumYGenerico {
    enum Nivel { BASICO, INTERMEDIO, AVANZADO }
    static class Caja<T> {
        private final T valor;
        Caja(T valor){ this.valor=valor; }
        T get(){ return valor; }
    }
    public static void main(String[] args){ Caja<Nivel> caja=new Caja<>(Nivel.BASICO); System.out.println(caja.get()); }
}
