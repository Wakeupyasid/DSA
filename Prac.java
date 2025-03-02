import java.awt.*;
import java.util.*;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        String s="zaz";
        int ans=0;
        List<Integer>a=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            int t=(int)s.charAt(i);
            a.add(t);
        }
        for (int i=0;i<a.size()-1;i++){
            int t=Math.abs(a.get(i+1)-a.get(i));
            ans=ans+t;
        }
        System.out.println(ans);
    }
}
