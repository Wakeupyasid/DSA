import java.util.Arrays;

public class lc1 {
    public static void main(String[] args) {
        int nums[]={3,3};
        int target =6;
        int ans[]=new int[2];
        for (int i=0;i< nums.length-1;i++){
            for (int j=i+1;j< nums.length;j++){
                if (nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
