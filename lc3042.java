public class lc3042 {
    // 3042. Count Prefix and Suffix Pairs I
    public static void main(String[] args) {
        String words[]={"a","aba","ababa","aa"};
        int ans=0;
        for (int i=0;i<words.length-1;i++){
            for (int j=i+1;j< words.length;j++){
                if (words[i].length()<words[j].length()){
                    if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
