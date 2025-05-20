import java.util.Stack;

public class lc1844 {
    // 1844. Replace All Digits with Characters
    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        Stack<String> a=new Stack<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>=97 && s.charAt(i)<=122){
                a.add(String.valueOf(s.charAt(i)));
            }
            else if (s.charAt(i)>=48 && s.charAt(i)<=57){
                int av = (int) s.charAt(i-1)+ (int)Integer.parseInt(String.valueOf(s.charAt(i)));
                char ch = (char) av;
                a.add(String.valueOf(ch));
            }
        }
        String ans="";
        for (int i=0;i<a.size();i++){
            ans=ans+a.get(i);
        }
        System.out.println(ans);
    }
}
