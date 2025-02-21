import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
//        Leetcode 283. Move Zeroes
        int nums[]={0,1,0,3,12};
        int ans[]=new int[nums.length];
        int k=0;
        for (int i =0;i< ans.length;i++){
            if (nums[i]!=0){
                ans[k]=nums[i];
                k++;
            }
        }
        for (int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
