public class lc1572 {
    // 1572. Matrix Diagonal Sum
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int diagonalSum = 0;
        int len = mat.length - 1;

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){

                if(i == j){
                    diagonalSum += mat[i][j];
                }
                else if(i == (len-j)){
                    diagonalSum += mat[i][j];
                }
            }
        }
        System.out.println(diagonalSum);
    }
}
