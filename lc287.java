import java.util.Arrays;

public class lc287 {
//    287. Find the Duplicate Number
    public static void main(String[] args) {
        int nums[]={7,9,7,4,2,8,7,7,1,5};
        Arrays.sort(nums);
        int ans=0;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                ans=nums[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
