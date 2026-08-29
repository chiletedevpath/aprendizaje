import java.util.*;
public class ContarComparaciones {
    static int binaria(int[] a,int x){int l=0,r=a.length-1,c=0;while(l<=r){c++;int m=l+(r-l)/2;if(a[m]==x)return c;if(a[m]<x)l=m+1;else r=m-1;}return c;}
    public static void main(String[] args){int[] a=new int[1000];Arrays.setAll(a,i->i*2);System.out.println(binaria(a,1998));}
}
