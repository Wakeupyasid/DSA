import java.util.Arrays;

public class lc2460 {
//    2460. Apply Operations to an Array
    public static void main(String[] args) {
        int nums[]={0,1};
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int ans[]=new int[nums.length];
        int c=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                ans[c++]=nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(ans));
    }
}
