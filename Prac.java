import java.awt.*;
import java.util.*;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        int n=7;
        int ans=0;
        for (int i=1;i<=n;i++){
            if (i%3==0 || i%5==0 || i%7==0){
                ans=ans+i;
            }
        }
        System.out.println(ans);
    }
}
