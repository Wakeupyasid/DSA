import java.util.ArrayList;
import java.util.*;

public class Prac {
    public static void main(String[] args) {
        String sentence = "i am tired", searchWord = "you";
        int ans=-1;
        String[] t = sentence.split(" ");
        for (int i=0;i<t.length;i++){
            if (t[i].length()>=searchWord.length()){
                if (t[i].startsWith(searchWord)){
                    ans=i+1;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
