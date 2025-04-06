public class lc58 {
    // 58. Length of Last Word
    public static void main(String[] args) {

        String s = "Hello World  ";
        int ans=0;
        int k=0;
        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)==0){
                i--;
            } else if (s.charAt(i)!=32) {
                ans++;
                k++;
            }
            
        }
        System.out.println(ans);
    }
}
