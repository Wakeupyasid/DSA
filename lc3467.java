import java.util.Arrays;

public class lc3467 {
    // 3467. Transform Array by Parity
    public static void main(String[] args) {
        int nums[]={1,5,1,4,2};

//        for (int i=0;i<nums.length;i++){
//            if (nums[i]%2==0){
//                nums[i]=0;
//            }
//            if (nums[i]%2!=0){
//                nums[i]=1;
//            }
//        }
        int ans[]=new int[nums.length];
        int c= nums.length-1;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2!=0){
                ans[c--]=1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
