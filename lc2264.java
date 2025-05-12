import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lc2264 {
    // 2264. Largest 3-Same-Digit Number in String
    public static void main(String[] args) {
        String num = "6777133339";
        List<Integer> a=new ArrayList<>();
        for (int i=0;i<num.length()-2;i++){
            if (num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)){
                int k= Integer.parseInt(String.valueOf(num.charAt(i)));
                a.add(k);
            }
        }
        Collections.sort(a);
        String ans="";
        if (!a.isEmpty()){
            ans= String.valueOf(a.getLast())+String.valueOf(a.getLast())+String.valueOf(a.getLast());
        }
        System.out.println(a);
        System.out.println(ans);
    }
}
