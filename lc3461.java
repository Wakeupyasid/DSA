public class lc3461 {
    // 3461. Check If Digits Are Equal in String After Operations I
    public static void main(String[] args) {
        String s = "3902";
        while (s.length()!=2){
            StringBuilder p= new StringBuilder();
            for (int i=0;i<s.length()-1;i++){
                int a= Integer.parseInt(String.valueOf(s.charAt(i)));
                int b= Integer.parseInt(String.valueOf(s.charAt(i+1)));
                int c=(a+b)%10;
                p.append(c);
            }
            s= String.valueOf(p);
        }
        boolean ans=false;
        if (s.charAt(0)==s.charAt(1)){
            ans=true;
        }
        System.out.println(ans);
    }
}
