public class lc74 {
    //    74. Search a 2D Matrix
    public static void main(String[] args) {
        int matrix[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        boolean ans = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix[i].length - 1] >= target) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == target) {
                        ans = true;
                        break;
                    }
                }
            }
            if (matrix[i][matrix[i].length - 1] < target) {
                break;
            }
        }
        System.out.println(ans);
    }
}
