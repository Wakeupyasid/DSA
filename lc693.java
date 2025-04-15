public class lc693 {
    // 693. Binary Number with Alternating Bits
    public static void main(String[] args) {
        int n=7;
        boolean ans=true;
        String s=Integer.toBinaryString(n);
        for (int i=0;i<s.length()-1;i++){
            if (s.charAt(i)==s.charAt(i+1)){
                ans=false;
                break;
            }
        }
        System.out.println(ans);
    }
}
