import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {
        String []words={"pay","attention","practice","attend"};
        String pref="at";
        int c=0;
        for (int i=0;i< words.length;i++){
            if (words[i].length()>=pref.length()){
                String s=words[i].substring(0,pref.length());
                if (pref.equals(s)){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
