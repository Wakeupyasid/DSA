import java.util.Arrays;

public class lc1365 {
    public static void main(String[] args) {
//        1365. How Many Numbers Are Smaller Than the Current Number
        int nums[]={8,1,2,2,3};
        int ans[]=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int c=0;
            for (int j=0;j< nums.length;j++){
                if (i!=j){
                    if (nums[j]<nums[i]){
                        c++;
                    }
                }
            }
            ans[i]=c;
        }
        System.out.println(Arrays.toString(ans));
    }
}
