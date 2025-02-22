import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc2089 {
    public static void main(String[] args) {
//        2089. Find Target Indices After Sorting Array
        int nums[]={1,2,5,2,3};
        int target=2;
        Arrays.sort(nums);
        List<Integer>ans=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
}
