import java.util.ArrayList;
import java.util.List;

public class lc2828 {
    // 2828. Check if a String Is an Acronym of Words
    public static void main(String[] args) {
        List<String> words=new ArrayList<>();
        String s="a";
        words.add("an");
//        words.add("bob");
        words.add("apple");
        String t="";
        boolean ans=true;
        if (words.size()!=s.length()){
            ans=false;
        }
        else {
            for (int i=0;i<words.size();i++){
                if (words.get(i).charAt(0)!=s.charAt(i)){
                    ans=false;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
