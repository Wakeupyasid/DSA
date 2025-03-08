import java.util.Arrays;

public class lc2643 {
//    2643. Row With Maximum Ones
    public static void main(String[] args) {
        int mat[][]={{0,0},{1,1},{0,0}};
        int ans[]=new int[2];
        int t=0;
        for (int i=0;i< mat.length;i++){
            int c=0;
            for (int j=0;j<mat[i].length;j++){
                if (mat[i][j]==1){
                    c++;
                }
                else break;
            }
            if (c>t){
                t=c;
                ans[0]=i;
                ans[1]=c;
            }
        }
        System.out.println(Arrays.toString(ans));
    }

}
