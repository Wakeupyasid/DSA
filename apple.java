import jdk.jfr.Unsigned;
import java.math.BigInteger;
import java.util.*;
public class apple {
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target=7;
        int ans=-1;
        for (int i=0;i< nums.length;i++){
            if (nums[i]>=target){
                ans=i;
                break;
            }
        }
        if (ans==-1){
            ans= nums.length;
        }
        System.out.println(ans);
    }
}
