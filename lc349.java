import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc349 {
    // 349. Intersection of Two Arrays
    public static void main(String[] args) {
        int nums1[] = {4, 9, 5};
        int nums2[] = {9, 4, 9, 8, 4};
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            a.add(nums1[i]);
        }
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (a.contains(nums2[i]) && !b.contains(nums2[i])) {
                b.add(nums2[i]);
            }
        }
        int ans[] = new int[b.size()];
        for (int i = 0; i < b.size(); i++) {
            ans[i] = b.get(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
