public class lc1967 {
//    1967. Number of Strings That Appear as Substrings in Word
    public static void main(String[] args) {
        String patterns[]={"a","b","c"};
        String word="aaaaabbbbb";
        int c=0;
        for (int i =0;i< patterns.length;i++){
            if (patterns[i].length()<=word.length()){
                if (word.contains(patterns[i])){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
