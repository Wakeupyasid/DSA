import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class lc884 {
    // 884. Uncommon Words from Two Sentences
    public static void main(String[] args) {
        String s1 = "this apple is sweet", s2 = "this apple is sour";
        String[] sp1 = s1.split(" ");
        String[] sp2 = s2.split(" ");
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < sp1.length; i++) {
            String str = sp1[i];
            if (frequencyMap.containsKey(str)) {
                frequencyMap.put(str, frequencyMap.get(str) + 1);
            } else {
                frequencyMap.put(str, 1);
            }
        }
        for (int i = 0; i < sp2.length; i++) {
            String str = sp2[i];
            if (frequencyMap.containsKey(str)) {
                frequencyMap.put(str, frequencyMap.get(str) + 1);
            } else {
                frequencyMap.put(str, 1);
            }
        }
        List<String> a=new ArrayList<>();
        for (String key : frequencyMap.keySet()) {
            if (frequencyMap.get(key)==1){
                a.add(key);
            }
        }
        String ans[]=new String[a.size()];
        for (int i=0;i<a.size();i++){
            ans[i]=a.get(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
