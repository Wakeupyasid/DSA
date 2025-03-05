import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lc2114 {
    //    2114. Maximum Number of Words Found in Sentences
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int ans = 0;
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < sentences.length; i++) {
            String t[] = sentences[i].split(" ");
            a.add(t.length);
        }
        Collections.sort(a);
        ans = a.getLast();
        System.out.println(ans);
    }
}
