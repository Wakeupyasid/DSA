import jdk.jfr.Unsigned;
import java.math.BigInteger;
import java.util.*;
public class apple {
    public static void main(String[] args) {
        int nums[]={7,1,5,4};
        int ans=-1;
        for (int i=0;i< nums.length-1;i++){
            for (int j=i+1;j< nums.length;j++){
                if (nums[j]>nums[i]){
                    if (nums[j]-nums[i]>ans){
                        ans=nums[j]-nums[i];
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
