import java.util.HashSet;
import java.util.Set;

public class lc2442 {
//    2442. Count Number of Distinct Integers After Reverse Operations
    public static void main(String[] args) {
        int nums[]={2,2,2};
        Set<Integer> a=new HashSet<>();
        for (int i=0;i< nums.length;i++){
            a.add(nums[i]);
            int res=0;
            while(nums[i] != 0) {
                int digit = nums[i] % 10;
                res= res * 10 + digit;
                nums[i] /= 10;
            }
            a.add(res);
        }
        int ans=a.size();
    }
}
