import java.util.Arrays;

public class lc2154 {
    // 2154. Keep Multiplying Found Values by Two
    public static void main(String[] args) {
        int nums[]={2,7,9};
        int originals=4;
        Arrays.sort(nums);
        int ans=originals;
        for (int i=0;i< nums.length;i++){
            if (nums[i]==ans){
                ans=ans*2;
            }
        }
        System.out.println(ans);
    }
}
