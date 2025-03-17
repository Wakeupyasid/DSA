import java.util.Arrays;

public class lc3300 {
    //    3300. Minimum Element After Replacement With Digit Sum
    public static void main(String[] args) {
        int nums[] = {999, 19, 199};
        for (int i = 0; i < nums.length; i++) {
            int t = 0;
            while (nums[i] > 0) {
                t = t + (nums[i] % 10);
                nums[i] = nums[i] / 10;
            }
            nums[i] = t;
        }
        Arrays.sort(nums);
        int ans = nums[0];
        System.out.println(ans);
    }
}
