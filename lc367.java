public class lc367 {
    //    367. Valid Perfect Square
    public static void main(String[] args) {
        int num = 1;
        boolean ans = false;
        if (num == 1) {
            ans = true;
        } else {
            for (int i = 1; i <= num / 2; i++) {
                if (i * i == num) {
                    ans = true;
                    break;
                }
                if (i * i > num) {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
