import java.util.ArrayList;
import java.util.*;

public class Prac {
    public static void main(String[] args) {
        int x=0;
        int t=x;
        boolean ans=false;
        if(x>=0){
            int res=0;
            while (x != 0) {
                res = res * 10 + x % 10;
                x = x / 10;
            }
            if (res==t){
                ans=true;
            }
        }
        System.out.println(ans);
    }
}
