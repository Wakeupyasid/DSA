import java.awt.*;
import java.util.*;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        int nums[]={-2,-1,-1,1,2,3};
        int ps=0;
        int ns=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]>0){
                ps++;
            }
            if (nums[i]<0){
                ns++;
            }
        }
        int ans=Math.max(ps,ns);
        System.out.println(ans);
    }
}
