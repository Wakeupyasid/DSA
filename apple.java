import java.util.*;

public class apple {
    public static void main(String[] args) {
        int salary[]={3000,1000,2000};
        double ans;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int t=0;
        for (int i=0;i<salary.length;i++){
            max=Math.max(max,salary[i]);
            min=Math.min(min,salary[i]);
            t=t+salary[i];
        }
        t=t-max-min;
        int n= salary.length-2;
        ans= (double) t /n;
        System.out.println(ans);
    }
}
