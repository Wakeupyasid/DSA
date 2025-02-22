import java.util.*;

public class lc2441 {
    public static void main(String[] args) {
//        2441. Largest Positive Integer That Exists With Its Negative
        int nums[]={-10,8,6,7,-2,-3};
        int ans=-1;
        Arrays.sort(nums);
        HashSet<Integer> s = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (nums[i]<0){
                s.add(nums[i]);
            }
        }
        for (int i =nums.length-1;i>=0;i--){
            if (nums[i]<0){
                break;
            }
            else {
                if (s.contains(0-nums[i])){
                    if (ans<nums[i]){
                        ans=nums[i];
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
