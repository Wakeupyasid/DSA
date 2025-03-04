import java.awt.*;
import java.util.*;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        int nums[]={1,2,2,1};
        int k=1;
        int ans=0;
        for (int i=0;i<nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if (i<j && Math.abs(nums[i] - nums[j]) == k){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
