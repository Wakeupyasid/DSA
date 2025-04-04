import java.util.Arrays;

public class lc260 {
    // 260. Single Number III
    public static void main(String[] args) {
        int nums[]={0,1,0,1,3,5,3,4,5,7};
        int ans[]=new int[2];
        int k=0;
        Arrays.sort(nums);
        for (int i=0;i< nums.length;i++){
            int c=0;
            for (int j=i;j< nums.length;j++){
                if (nums[j]==nums[i]){
                    c++;
                }
                if (c>1){
                    break;
                }
            }
            if (c==1){
                ans[k++]=nums[i];
            }
            i=i+c-1;
        }
        System.out.println(Arrays.toString(ans));
    }
}
