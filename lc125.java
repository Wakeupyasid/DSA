public class lc125 {
    // 125. Valid Palindrome
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s=s.toLowerCase();
        String n="";
        for (int i=0;i<s.length();i++){
            if ((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=48 && s.charAt(i)<=57)){
                n=n+s.charAt(i);
            }
        }
        boolean ans=true;
        for (int i=0;i<n.length()/2;i++){
            if (n.charAt(i)!=n.charAt(n.length()-1-i)){
                ans=false;
            }
        }
        System.out.println(ans);
    }
}
