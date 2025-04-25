import java.util.HashMap;
import java.util.Map;

public class lc3442 {
    // 3442. Maximum Difference Between Even and Odd Frequency I
    public static void main(String[] args) {
        String s = "abcabcab";
        int n=s.length();
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = s.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (Map.Entry entry : charCountMap.entrySet()) {
            int p= (int) entry.getValue();
            if (p%2!=0 && p>max){
                max=p;
            }
            else if (p%2==0 && p<min){
                min=p;
            }
        }
        int ans=max-min;
        System.out.println(ans);
    }
}
