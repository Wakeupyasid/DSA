public class lc2278 {
    //    2278. Percentage of Letter in String
    public static void main(String[] args) {
        String s="foobar";
        char letter ='o';
        int ans=0;
        int c=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==letter){
                c++;
            }
        }
        if (c!=0){
            ans=(c*100)/s.length();
        }
        System.out.println(ans);
        System.out.println(c);
    }
}
