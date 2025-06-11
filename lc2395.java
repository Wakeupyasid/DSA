import java.util.ArrayList;
import java.util.List;

public class lc2395 {
    // 2395. Find Subarrays With Equal Sum
    public static void main(String[] args) {
        int nums[]={0,0,0};
        List<Integer> a=new ArrayList<>();
        boolean ans =false;
        for (int i=0;i< nums.length-1;i++){
            int c=nums[i]+nums[i+1];
            if (!a.contains(c)){
                a.add(c);
            }
            else{
                ans=true;
                break;
            }
        }
        System.out.println(ans);
    }
}
