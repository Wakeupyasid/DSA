public class lc1837 {
    // 1837. Sum of Digits in Base K
    public static void main(String[] args) {
        int n = 34, k = 6;
        int ans = 0;
        while (n > 0) {
            ans += n % k;
            n /= k;
        }
        System.out.println(ans);
    }
}
