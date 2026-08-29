import java.util.*;
public class PrimPractica {
    public static void main(String[]args){int INF=9999;int[][]g={{0,2,INF,6},{2,0,3,8},{INF,3,0,1},{6,8,1,0}};boolean[]v=new boolean[4];v[0]=true;int costo=0;for(int e=0;e<3;e++){int mejor=INF,a=-1,b=-1;for(int i=0;i<4;i++)if(v[i])for(int j=0;j<4;j++)if(!v[j]&&g[i][j]<mejor){mejor=g[i][j];a=i;b=j;}v[b]=true;costo+=mejor;System.out.println(a+"-"+b+":"+mejor);}System.out.println("Costo="+costo);}
}
