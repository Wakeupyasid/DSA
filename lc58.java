public class lc58 {
    // 58. Length of Last Word
    public static void main(String[] args) {
        String s="VPtCBexbhyOqEHWMpF  VJOZpC";
        s = s.trim();
        int c = 0;
        for(int i = s.length()-1; i>=0;i--) {
            if (s.charAt(i) != ' ') {
                c++;
            } else if (c > 0) {
                break;
            }
        }
        System.out.println(c);
    }
}
