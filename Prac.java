import java.util.ArrayList;
import java.util.*;

public class Prac {
    public static void main(String[] args) {
        int nums[]={2,2,2};
        Set<Integer>a=new HashSet<>();
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
