import java.math.BigInteger;
import java.util.*;

public class apple {
    public static void main(String[] args) {
        String s = "azxxzy";
        Stack<String>a=new Stack<>();
        for (int i=0;i<s.length();i++){
            String p= String.valueOf(s.charAt(i));
             if (a.empty()){
                 a.push(p);
             }
             else {
                 if (Objects.equals(a.peek(), p)){
                     a.pop();
                 }
                 else {
                     a.push(p);
                 }
             }
        }
        String ans="";
        for (String i:a){
            ans=ans+i;
        }
        System.out.println(ans);
    }
}
