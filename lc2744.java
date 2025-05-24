public class lc2744 {
    // 2744. Find Maximum Number of String Pairs
    public static void main(String[] args) {
        String words[]={"ab","ba","cc"};
        int ans=0;
        for (int i=0;i<words.length-1;i++){
            for (int j=i+1;j< words.length;j++){
                String rs = new StringBuilder(words[j]).reverse().toString();
                if (words[i].equals(rs)){
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
