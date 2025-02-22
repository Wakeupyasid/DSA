import java.util.Arrays;

public class lc2974 {
    public static void main(String[] args) {
//        2974. Minimum Number Game
        int nums[]={5,4,2,3};
        Arrays.sort(nums);
        int ans[]=new int[nums.length];
        for (int i=0;i<nums.length-1;i++){
            ans[i]=nums[i+1];
            ans[i+1]=nums[i];
            i++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
