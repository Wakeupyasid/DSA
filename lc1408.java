import java.util.ArrayList;
import java.util.List;

public class lc1408 {
    // 1408. String Matching in an Array
    public static void main(String[] args) {
        String []words={"mass","as","hero","superhero"};
        List<String> ans=new ArrayList<>();
        for (int i=0;i< words.length;i++){
            for (int j=0;j<words.length;j++){
                if (i!=j){
                    if (words[i].contains(words[j]) && !ans.contains(words[j])){
                        ans.add(words[j]);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
