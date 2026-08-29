public class SumaDigitos {
    static int suma(int n){ n=Math.abs(n); if(n<10)return n; return n%10+suma(n/10); }
    public static void main(String[] args){System.out.println(suma(2026));}
}
