import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lc3079 {
    // 3079. Find the Sum of Encrypted Integers
    public static void main(String[] args) {
        int nums[] = {109};
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int k = 0;
            List<Integer> a = new ArrayList<>();
            while (nums[i] > 0) {
                a.add(nums[i] % 10);
                nums[i] = nums[i] / 10;
                k++;
            }
            Collections.sort(a);
            System.out.println(k);
            System.out.println(nums[i]);
            int p = a.getLast();
            int t = 1;
            while (k > 0) {
                nums[i] = (nums[i] * t) + p;
                k--;
                t = 10;
            }
            ans = ans + nums[i];
            System.out.println(nums[i]);
        }
        System.out.println(ans);
    }
}
