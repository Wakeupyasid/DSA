import java.util.ArrayList;
import java.util.*;

public class Prac {
    public static void main(String[] args) {
        int nums[]={1,2,3,3};
        int ans=0;
        int n= nums.length/2;
        Arrays.sort(nums);
        for (int i=0;i< nums.length;i++){
            int c=0;
            for (int j=i;j< nums.length;j++){
                if (nums[j]==nums[i]){
                    c++;
                }
            }
            if (c==n){
                ans=nums[i];
                break;
            }
            else {
                i=i+c-1;
            }
        }
        System.out.println(ans);
    }
}
