import java.util.ArrayList;
import java.util.*;

public class Prac {
    public static void main(String[] args) {

        int nums[]={3,3};
        int ans=0;
        Arrays.sort(nums);
        int f=nums[0];
        int l=nums[nums.length-1];
        for (int i=l;i>=1;i--){
            if (f%i==0 && l%i==0){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
