public class SumaDivideVenceras {
    static int suma(int[]a,int l,int r){if(l==r)return a[l];int m=l+(r-l)/2;return suma(a,l,m)+suma(a,m+1,r);}
    public static void main(String[]args){int[]a={1,2,3,4,5};System.out.println(suma(a,0,a.length-1));}
}
