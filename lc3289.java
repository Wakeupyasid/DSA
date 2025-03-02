import java.util.Arrays;

public class lc3289 {
    //    3289. The Two Sneaky Numbers of Digitville
    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};
        int ans[] = new int[2];
        int k = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                ans[k++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
