import java.awt.*;
import java.util.*;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        int n=15;
        List<String>ans=new ArrayList<>();
        for (int i=0;i<n;i++){
            if ((i+1)%3==0 && (i+1)%5==0){
                ans.add("FizzBuzz");
            } else if ((i+1)%3==0 && (i+1)%5!=0) {
                ans.add("Fizz");
            } else if ((i+1)%3!=0 && (i+1)%5==0) {
                ans.add("Buzz");
            } else  {
                ans.add(String.valueOf(i+1));
            }
        }
        System.out.println(ans);
    }
}
