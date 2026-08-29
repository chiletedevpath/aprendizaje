import java.util.Objects;
public class RetoDocumento {
    static class Documento {
        private final String codigo;
        Documento(String codigo){this.codigo=codigo;}
        @Override public boolean equals(Object o){ if(this==o)return true; if(!(o instanceof Documento d))return false; return Objects.equals(codigo,d.codigo); }
        @Override public int hashCode(){ return Objects.hash(codigo); }
        @Override public String toString(){ return "Documento[codigo="+codigo+"]"; }
    }
    public static void main(String[] args){ System.out.println(new Documento("X").equals(new Documento("X"))); }
}
