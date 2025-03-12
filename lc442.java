import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc442 {
//    442. Find All Duplicates in an Array
    public static void main(String[] args) {
        int nums[]={1};
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1] && !ans.contains(nums[i])){
                ans.add(nums[i]);
            }
        }
        System.out.println(ans);
    }
}
