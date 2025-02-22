import java.util.Arrays;

public class lc2733 {
    public static void main(String[] args) {
//        2733. Neither Minimum nor Maximum
        int nums[]={2,1,3};
        Arrays.sort(nums);
        int ans=-1;
        if (nums.length==3){
            ans=nums[1];
        } else if (nums.length>=4) {
            ans=nums[1];
        }
        System.out.println(ans);
    }
}
