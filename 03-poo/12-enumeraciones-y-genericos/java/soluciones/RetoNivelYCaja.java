public class RetoNivelYCaja {
    enum NivelCurso { BASICO, INTERMEDIO, AVANZADO }
    static class Caja<T> { private T valor; void guardar(T valor){this.valor=valor;} T obtener(){return valor;} }
    public static void main(String[] args){ Caja<String> caja=new Caja<>(); caja.guardar("Recurso POO"); System.out.println(NivelCurso.INTERMEDIO+" - "+caja.obtener()); }
}
