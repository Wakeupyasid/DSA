import java.util.HashMap;
import java.util.Map;

public class lc3541 {
    // 3541. Find Most Frequent Vowel and Consonant
    public static void main(String[] args) {
        String s = "successes";
        Map<Character, Integer> v = new HashMap<>();
        Map<Character, Integer> co = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                v.put(c, v.getOrDefault(c, 0) + 1);
            }
            if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                co.put(c, co.getOrDefault(c, 0) + 1);
            }
        }
        int m1=0;
        for (Map.Entry<Character, Integer> entry : v.entrySet()) {
            if (entry.getValue()>m1){
                m1= entry.getValue();
            }
        }
        int m2=0;
        for (Map.Entry<Character, Integer> entry : co.entrySet()) {
            if (entry.getValue()>m2){
                m2= entry.getValue();
            }
        }
        int ans=m1+m2;
        System.out.println(ans);
    }
}
