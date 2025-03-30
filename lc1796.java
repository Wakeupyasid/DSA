import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lc1796 {
    // 1796. Second Largest Digit in a String
    public static void main(String[] args) {
        String s = "sjhtz8344";
        int ans=-1;
        List<Integer> a=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>=48 && s.charAt(i)<=57){
                int p=Integer.parseInt(String.valueOf(s.charAt(i)));
                if (!a.contains(p)){
                    a.add(p);
                }
            }
        }
        Collections.sort(a);
        if (a.size()>=2){
            ans=a.get(a.size()-2);
        }
        System.out.println(ans);
    }
}
