public class lc434 {
    // 434. Number of Segments in a String
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        int segmentCount = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                ++segmentCount;
            }
        }
        System.out.println(segmentCount);
    }
}
