public class lc2413 {
    //    2413. Smallest Even Multiple
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        for (int i = 2; i <= n * 2; i++) {
            if (i % 2 == 0 && i % n == 0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
