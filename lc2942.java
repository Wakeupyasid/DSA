import java.util.ArrayList;
import java.util.List;

public class lc2942 {
//    2942. Find Words Containing Character
    public static void main(String[] args) {
        String []words={"abc","bcd","aaaa","cbc"};
        char x='a';
        String s= String.valueOf(x);
        List<Integer> a=new ArrayList<>();
        for (int i=0;i< words.length;i++){
            if (words[i].contains(s)){
                a.add(i);
            }
        }
        System.out.println(a);
    }
}
