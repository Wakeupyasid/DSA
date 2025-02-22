import java.util.Arrays;

public class lc977 {
    public static void main(String[] args) {
//        977. Squares of a Sorted Array
        int nums[]={-4,-1,0,3,10};
        int ans[]=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
    }
}
