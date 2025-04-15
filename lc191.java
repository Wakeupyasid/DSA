public class lc191 {
    // 191. Number of 1 Bits
    public static void main(String[] args) {
        int n=11;
        String s=Integer.toBinaryString(n);
        int ans=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='1'){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
