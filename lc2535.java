public class lc2535 {
    public static void main(String[] args) {
//        2535. Difference Between Element Sum and Digit Sum of an Array
        int nums[]={1,2,3,4};
        int esum=0;
        int dsum=0;
        for (int i =0;i<nums.length;i++){
            esum=esum+nums[i];
            while (nums[i] > 0) {
                int r = nums[i] % 10;
                dsum=dsum+r;
                nums[i] = nums[i] / 10;
            }
        }
        int ans=Math.abs(esum-dsum);
        System.out.println(ans);
    }
}
