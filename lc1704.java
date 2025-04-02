public class lc1704 {
    // 1704. Determine if String Halves Are Alike
    public static void main(String[] args) {
        String s = "textbook";
        String p1=s.substring(0,s.length()/2);
        String p2=s.substring(s.length()/2,s.length());
        int c1=0;
        int c2=0;
        for (int i=0;i<p1.length();i++){
            if (p1.charAt(i)=='a' || p1.charAt(i)=='e' || p1.charAt(i)=='i' || p1.charAt(i)=='o' || p1.charAt(i)=='u' ||
                    p1.charAt(i)=='A' || p1.charAt(i)=='E' || p1.charAt(i)=='I' || p1.charAt(i)=='O' || p1.charAt(i)=='U'){
                c1++;
            }
            if (p2.charAt(i)=='a' || p2.charAt(i)=='e' || p2.charAt(i)=='i' || p2.charAt(i)=='o' || p2.charAt(i)=='u' ||
                    p2.charAt(i)=='A' || p2.charAt(i)=='E' || p2.charAt(i)=='I' || p2.charAt(i)=='O' || p2.charAt(i)=='U'){
                c2++;
            }
        }
        boolean ans=false;
        if (c1==c2){
            ans=true;
        }
        System.out.println(ans);
    }
}
