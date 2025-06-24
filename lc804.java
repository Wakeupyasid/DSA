import java.util.HashSet;
import java.util.Set;

public class lc804 {
    public static void main(String[] args) {
        String words[]={"gin","zen","gig","msg"};
        String[] morseCodes = new String[] {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."};
        Set<String> uniqueTransformations = new HashSet<>();
        for (String word : words) {
            StringBuilder morseWord = new StringBuilder();
            for (char ch : word.toCharArray()) {
                morseWord.append(morseCodes[ch - 'a']);
            }
            uniqueTransformations.add(morseWord.toString());
        }
        System.out.println(uniqueTransformations.size());
    }
}
