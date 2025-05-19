import java.util.ArrayList;
import java.util.List;

public class lc917 {
    // 917. Reverse Only Letters
    public static void main(String[] args) {
        String s = "ab-cd";
        List<String> a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if ((s.charAt(i) >=65 && s.charAt(i)<=90) || (s.charAt(i) >=97 && s.charAt(i)<=122)){
                a.add(String.valueOf(s.charAt(i)));
                b.add(i);
            }
        }
        a=a.reversed();
        int k=0;
        StringBuilder p=new StringBuilder(s);
        for (int i=0;i<b.size();i++){
            p.replace(b.get(i),b.get(i)+1,a.get(k++));
        }
        String ans= String.valueOf(p);
    }
}
