public class Sudoku4x4 {
    static boolean resolver(int[][] t){for(int f=0;f<4;f++)for(int c=0;c<4;c++)if(t[f][c]==0){for(int n=1;n<=4;n++){if(valido(t,f,c,n)){t[f][c]=n;if(resolver(t))return true;t[f][c]=0;}}return false;}return true;}
    static boolean valido(int[][]t,int f,int c,int n){for(int i=0;i<4;i++)if(t[f][i]==n||t[i][c]==n)return false;int rf=f/2*2,rc=c/2*2;for(int i=rf;i<rf+2;i++)for(int j=rc;j<rc+2;j++)if(t[i][j]==n)return false;return true;}
    public static void main(String[]args){int[][]t={{1,0,0,4},{0,4,1,0},{0,1,4,0},{4,0,0,1}};System.out.println(resolver(t));}
}
