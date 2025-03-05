public class lc2319 {
//    2319. Check if Matrix Is X-Matrix
    public static void main(String[] args) {
        int [][]grid={{5,7,0},{0,3,1},{0,5,0}};
        boolean ans=true;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                if (i==j || i+j==grid.length-1){
                    if (grid[i][j]==0){
                        ans=false;
                        break;
                    }
                }
                else {
                    if (grid[i][j] != 0) {
                        ans = false;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
