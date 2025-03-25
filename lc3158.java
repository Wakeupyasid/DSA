import java.util.Arrays;

public class lc3158 {
    // 3158. Find the XOR of Numbers Which Appear Twice
    public static void main(String[] args) {
        int nums[]={1,2,2,1};
        int ans=0;
        Arrays.sort(nums);
        for (int i=0;i< nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                ans=ans^nums[i];
            }
        }
        System.out.println(ans);
    }
}
