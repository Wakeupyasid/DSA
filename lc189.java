import java.util.Arrays;

public class lc189 {
    // 189. Rotate Array
    public static void main(String[] args) {
        int nums[]={-1,-100,3,99};
        int k=6;
        if (k> nums.length){
            k= k%nums.length;
        }
        int ans[]=new int[nums.length];
        int t=0;
        for (int i= nums.length-k;i< nums.length;i++){
            ans[t++]=nums[i];
        }
        for (int i=0;i< nums.length-k;i++){
            ans[t++]=nums[i];
        }
        for (int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
