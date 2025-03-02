import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        int nums[]={7,1,5,4,3,4,6,0,9,5,8,2};
        // 0 0 1 1
        int ans[]=new int[2];
        int k=0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                ans[k++]=nums[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
