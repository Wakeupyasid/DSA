public class lc2027 {
    public static void main(String[] args) {
        String s="XXX";
        int moves = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 2;
            }
        }
        System.out.println(moves);
    }
}
