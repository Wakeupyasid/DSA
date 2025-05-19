import java.util.ArrayList;
import java.util.List;

public class lc345 {
    // 345. Reverse Vowels of a String
    public static void main(String[] args) {
        String s = "IceCreAm";
        List<String> a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            String c= String.valueOf(s.charAt(i));
            if (c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u") || c.equals("A") || c.equals("E") || c.equals("I") || c.equals("O") || c.equals("U")){
                a.add(c);
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
        System.out.println(ans);
    }
}
