public class lc520 {
    public static boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) ||
                word.substring(1).equals(word.substring(1).toLowerCase());
    }
    public static void main(String[] args) {
        String s="DSA";
        System.out.println(detectCapitalUse(s));
    }
}
