public class EscaleraDinamica {
    static long formas(int n){if(n<0)return 0;if(n<=1)return 1;long a=1,b=1;for(int i=2;i<=n;i++){long c=a+b;a=b;b=c;}return b;}
    public static void main(String[]args){System.out.println(formas(10));}
}
