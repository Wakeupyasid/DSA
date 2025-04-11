import java.util.*;

public class apple {
    public static void main(String[] args) {
        String s = "0P";
        s=s.toLowerCase();
        String a="";
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int av= (int)ch;
            if (97<=av && av<=122){
                a=a+ch;
            }
        }
        boolean ans=true;
        for (int i=0;i<a.length()/2;i++){
            if (a.charAt(i)!=a.charAt(a.length()-i-1)){
                ans=false;
                break;
            }
        }
        System.out.println(ans);
    }
}
