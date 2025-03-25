public class lc2255 {
    // 2255. Count Prefixes of a Given String
    public static void main(String[] args) {
        String words[] = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        int ans=0;
        for (int i=0;i< words.length;i++){
            if (s.startsWith(words[i])){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
