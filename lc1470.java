import java.util.Arrays;

public class lc1470 {
    public static void main(String[] args) {
//        1470. Shuffle the Array
        int nums[]={1,2,3,4,4,3,2,1};
        int n=4;
        int k=0;
        int ans[]=new int[nums.length];
        for (int i=0;i<n;i++){
            ans[k]=nums[i];
            ans[k+1]=nums[i+n];
            k=k+2;
        }
        System.out.println(Arrays.toString(ans));
    }
}
