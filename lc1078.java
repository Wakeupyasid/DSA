import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class lc1078 {
    // 1078. Occurrences After Bigram
    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student";
        String first = "a", second = "good";
        String[] f = text.split(" ");
        List<String> p=new ArrayList<>();
        for (int i=0;i<f.length-2;i++){
            if (Objects.equals(f[i], first) && Objects.equals(f[i + 1], second)){
                p.add(f[i+2]);
            }
        }
        String []ans=new String[p.size()];
        for (int i=0;i<p.size();i++){
            ans[i]=p.get(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
