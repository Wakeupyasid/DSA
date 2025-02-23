import java.util.Arrays;

public class lc1480 {
    public static void main(String[] args) {
//        1480. Running Sum of 1d Array
        int nums[]={3,1,2,10,1};
        int ans[]=new int[nums.length];
        ans[0]=nums[0];
        for (int i=1;i< nums.length;i++){
            ans[i]=ans[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
