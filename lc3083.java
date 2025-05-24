public class lc3083 {
    // 3083. Existence of a Substring in a String and Its Reverse
    public static void main(String[] args) {
        String s = "abcd";
        String rs = new StringBuilder(s).reverse().toString();
        boolean ans=false;
        int a=0;
        for (int i=0;i<s.length();i++){
            String p="";
            for (int j=i;j<s.length();j++){
                p=p+s.charAt(j);
                if (s.contains(p) && rs.contains(p) && p.length()>=2){
                    a=1;
                    break;
                }
            }
            if (a==1){
                ans=true;
                break;
            }
        }
        System.out.println(ans);
    }
}
