import java.util.ArrayList;
import java.util.*;

public class Prac {
    public static void main(String[] args) {
        int num=1248;
        int nno=num;
        int ans=0;
        while (num>0){
            int t=num%10;
            if (nno%t==0){
                ans++;
            }
            num=num/10;
        }
        System.out.println(ans);
    }
}
