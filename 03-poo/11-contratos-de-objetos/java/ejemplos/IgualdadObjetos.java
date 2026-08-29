import java.util.Objects;
public class IgualdadObjetos {
    static class Documento {
        final String codigo;
        Documento(String codigo){this.codigo=codigo;}
        @Override public boolean equals(Object obj){
            if (this == obj) return true;
            if (!(obj instanceof Documento otro)) return false;
            return Objects.equals(codigo, otro.codigo);
        }
        @Override public int hashCode(){ return Objects.hash(codigo); }
        @Override public String toString(){ return "Documento{" + codigo + "}"; }
    }
    public static void main(String[] args){ System.out.println(new Documento("A1").equals(new Documento("A1"))); }
}
