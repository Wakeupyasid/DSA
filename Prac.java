import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Prac {
    public static void main(String[] args) {
        String patterns[]={"a","b","c"};
        String word="aaaaabbbbb";
        int c=0;
        for (int i =0;i< patterns.length;i++){
            if (patterns[i].length()<=word.length()){
                if (word.contains(patterns[i])){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
