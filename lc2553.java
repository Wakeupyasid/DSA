import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc2553 {
    public static void main(String[] args) {
        int nums[] = {7,1,3,9};
        List<Integer> a=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            List<Integer>t=new ArrayList<>();
            while (nums[i]>0){
                t.addFirst(nums[i]%10);
                nums[i]=nums[i]/10;
            }
            a.addAll(t);
        }
        int ans[]=new int[a.size()];
        for (int i=0;i< ans.length;i++){
            ans[i]=a.get(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
