import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lc3079 {
    // 3079. Find the Sum of Encrypted Integers
    public static void main(String[] args) {
        int nums[]={1,2,3};
        int ans=0;
        for (int i=0;i< nums.length;i++){
            List<Integer> a=new ArrayList<>();
            int t=nums[i];
            int m=0;
            while (t>0){
                a.add(t%10);
                t=t/10;
            }
            Collections.sort(a);
        }
    }
}
