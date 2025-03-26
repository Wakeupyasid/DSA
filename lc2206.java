import java.util.Arrays;

public class lc2206 {
    // 2206. Divide Array Into Equal Pairs
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        boolean ans=true;
        Arrays.sort(nums);
        for (int i=0;i< nums.length;i=i+2){
            if (nums[i]!=nums[i+1]){
                ans=false;
                break;
            }
        }
        System.out.println(ans);
    }
}
