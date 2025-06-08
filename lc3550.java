public class lc3550 {
    // 3550. Smallest Index With Digit Sum Equal to Index
    public static void main(String[] args) {
        int nums[]={1,3,2};
        int ans=-1;
        for (int i=0;i< nums.length;i++){
            int k=0;
            while (nums[i]>0){
                k=k+nums[i]%10;
                nums[i]=nums[i]/10;
            }
            if (k==i){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
