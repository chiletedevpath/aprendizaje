public class VerificarMaximo {
    static int maximo(int[] a) { if (a.length==0) throw new IllegalArgumentException(); int m=a[0]; for(int i=1;i<a.length;i++) if(a[i]>m)m=a[i]; return m; }
    public static void main(String[] args){ System.out.println(maximo(new int[]{3,9,2,7})); }
}
