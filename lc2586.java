public class lc2586 {
    //    2586. Count the Number of Vowel Strings in Range
    public static void main(String[] args) {
        String words[] = {"hey", "aeo", "mu", "ooo", "artro"};
        int left = 1;
        int right = 4;
        int ans = 0;
        for (int i = left; i <= right; i++) {
            char a = words[i].charAt(0);
            char b = words[i].charAt(words[i].length() - 1);
            int a1 = 0;
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o'
                    || a == 'u') {
                a1++;
            }
            if (b == 'a' || b == 'e' || b == 'i' || b == 'o'
                    || b == 'u') {
                a1++;
            }
            if (a1 == 2) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
