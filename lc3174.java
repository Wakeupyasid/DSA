import java.util.Stack;

public class lc3174 {
    // 3174. Clear Digits
    public static void main(String[] args) {
        String s="abc1";
        Stack<String> a=new Stack<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>=97 && s.charAt(i)<=122){
                a.push(String.valueOf(s.charAt(i)));
            }
            else a.pop();
        }
        String ans="";
        for (int i=0;i<a.size();i++){
            ans=ans+a.get(i);
        }
    }
}
