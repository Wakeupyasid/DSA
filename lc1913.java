import java.util.Arrays;

public class lc1913 {
    // 1913. Maximum Product Difference Between Two Pairs
    public static void main(String[] args) {
        int nums[]={5,6,2,7,4};
        Arrays.sort(nums);
        int maxP=nums[nums.length-1] * nums[nums.length-2];
        int minP=nums[0]*nums[1];
        int ans=maxP-minP;
        System.out.println(ans);
    }
}
