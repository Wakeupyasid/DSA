import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lc1446 {
    // 1446. Consecutive Characters
    public static void main(String[] args) {
        String s = "j";
        List<Integer> a=new ArrayList<>();
        for (int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            int k=0;
            for (int j=i;j<s.length();j++){
                if (s.charAt(j)==ch){
                    k++;
                }
                else break;
            }
            a.add(k);
        }
        Collections.sort(a);
        int ans=1;
        if (!a.isEmpty()){
            ans=a.getLast();
        }
    }
}
