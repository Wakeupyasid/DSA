import java.util.HashMap;

public class lc1832 {
    // 1832. Check if the Sentence Is Pangram
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        HashMap<Character, Integer> cf = new HashMap<>();
        for (char c : sentence.toCharArray()) {
            cf.put(c, cf.getOrDefault(c, 0) + 1);
        }
        boolean ans=true;
        if (cf.size()!=26){
            ans=false;
        }
        System.out.println(ans);
    }
}
