import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        int nums[]={5,6,2,7,4};
        Arrays.sort(nums);
        int maxP=nums[nums.length-1] * nums[nums.length-2];
        int minP=nums[0]*nums[1];
        int ans=maxP-minP;
        System.out.println(ans);
    }
}
