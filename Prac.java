import java.util.ArrayList;
import java.util.*;

public class Prac {
    public static void main(String[] args) {
        String num="51230100";
        StringBuilder sb=new StringBuilder(num);
        for (int i=sb.length()-1;i>=0;i--){
            if (sb.charAt(i)=='0'){
                sb.deleteCharAt(i);
            }
            else break;
        }
        num= String.valueOf(sb);
        System.out.println(num);

    }
}
