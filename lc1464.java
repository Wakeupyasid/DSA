import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lc1464 {
//    1464. Maximum Product of Two Elements in an Array
    public static void main(String[] args) {
        int nums[]={1,5,4,5};
        int ans=0;
        List<Integer> a=new ArrayList<>();
        for (int i=0;i< nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                int k=(nums[i]-1)*(nums[j]-1);
                a.add(k);
            }
        }
        Collections.sort(a);
        ans=a.getLast();
        System.out.println(ans);
    }
}
