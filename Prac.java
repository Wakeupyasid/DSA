import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {
        String []details={"7868190130M7522","5303914400F9211","9273338290F4010"};
        int ans=0;
        for (int i=0;i< details.length;i++){
            int a=Integer.parseInt(String.valueOf(details[i].charAt(details[i].length()-4)));
            int b=Integer.parseInt(String.valueOf(details[i].charAt(details[i].length()-3)));
            int f=(a*10)+b;
            if (f>60){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
