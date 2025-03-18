public class lc2544 {
    //    2544. Alternating Digit Sum
    public static void main(String[] args) {
        int n = 886996;
        int ans = 0;
        String p = String.valueOf(n);
        for (int i = 0; i < p.length(); i++) {
            if (i % 2 == 0) {
                ans = ans + Character.getNumericValue(p.charAt(i));
            }
            if (i % 2 != 0) {
                ans = ans + Character.getNumericValue(p.charAt(i)) * (-1);
            }
        }
        System.out.println(ans);
    }
}
