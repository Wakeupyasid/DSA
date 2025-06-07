public class lc1422 {
    // 1422. Maximum Score After Splitting a String
    public static void main(String[] args) {
        String s = "00111";
        int ans=Integer.MIN_VALUE;
        for (int i=1;i<s.length();i++){
            String a=s.substring(0,i);
            String b=s.substring(i);
            int c=0;
            int d=0;
            for (int j=0;j<a.length();j++){
                if (a.charAt(j)=='0'){
                    c++;
                }
            }
            for (int j=0;j<b.length();j++){
                if (b.charAt(j)=='1'){
                    d++;
                }
            }
            ans=Math.max(ans,(c+d));
        }
        System.out.println(ans);
    }
}
