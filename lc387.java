import java.util.ArrayList;
import java.util.List;

public class lc387 {
    // 387. First Unique Character in a String
    public static void main(String[] args) {
        String s = "leetcode";
        int ans=-1;
        List<Character> a=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if (!a.contains(s.charAt(i))){
                int c=0;
                a.add(s.charAt(i));
                for (int j=i;j<s.length();j++){
                    if (s.charAt(i)==s.charAt(j)){
                        c++;
                    }
                }
                if (c==1){
                    ans=i;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
