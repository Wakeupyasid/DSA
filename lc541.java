import java.util.ArrayList;
import java.util.List;

public class lc541 {
    // 541. Reverse String II
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        List<String> p=new ArrayList<>();
        for (int i=0;i<s.length();i=i+k){
            p.add(s.substring(i, Math.min(i + k, s.length())));
        }
        String ans="";
        for (int i=0;i<p.size();i++){
            StringBuilder t=new StringBuilder(p.get(i));
            if (i%2==0){
                t=t.reverse();
                ans=ans+t;
            }
            else{
                ans=ans+t;
            }
        }
        System.out.println(ans);
    }
}
