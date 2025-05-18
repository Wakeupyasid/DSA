public class lc509 {
    // 509. Fibonacci Number
    public static void main(String[] args) {
        int n=2;
        int[] dp = {0, 0, 1};

        for (int i = 2; i <= n; ++i) {
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = dp[0] + dp[1];
        }
    }
}
