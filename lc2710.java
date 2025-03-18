public class lc2710 {
    //    2710. Remove Trailing Zeros From a String
    public static void main(String[] args) {
        String num = "51230100";
        StringBuilder sb = new StringBuilder(num);
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '0') {
                sb.deleteCharAt(i);
            } else break;
        }
        num = String.valueOf(sb);
        System.out.println(num);
    }
}
