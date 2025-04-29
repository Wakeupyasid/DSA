import java.util.Arrays;

public class lc164 {
    // 164. Maximum Gap
    public static void main(String[] args) {
        int nums[]={10};
        Arrays.sort(nums);
        int ans=0;
        if (nums.length>1){
            for (int i=0;i< nums.length-1;i++){
                int k=nums[i+1]-nums[i];
                ans=Math.max(ans,k);
            }
        }
        System.out.println(ans);
    }
}
