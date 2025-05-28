public class lc1935 {
    // 1935. Maximum Number of Words You Can Type
    public static void main(String[] args) {
        String text = "leet code", brokenLetters = "lt";
        int ans=0;
        String []s=text.split(" ");
        for (int i=0;i<s.length;i++){
            boolean k=true;
            for (int j=0;j<s[i].length();j++){
                String ch= String.valueOf(s[i].charAt(j));
                if (brokenLetters.contains(ch)){
                    k=false;
                    break;
                }
            }
            if (k==true){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
