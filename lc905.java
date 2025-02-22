import java.util.Arrays;

public class lc905 {
    public static void main(String[] args) {
//        905. Sort Array By Parity
        int nums[]={0};
        int ans[]=new int[nums.length];
        if (nums.length==1){
            ans[0]=nums[0];
        }
        else{
            int a=0;
            int b=nums.length-1;
            for (int i=0;i< nums.length;i++){
                if (nums[i]%2==0){
                    ans[a++]=nums[i];
                }
                else {
                    ans[b--]=nums[i];
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
