public class lc1827 {
    // 1827. Minimum Operations to Make the Array Increasing
    public static void main(String[] args) {
        int nums[]={0};
        int ans=0;
        if (nums.length>1){
            for (int i=1;i< nums.length;i++){
                if (nums[i]<=nums[i-1]){
                    int t=1+nums[i-1]-nums[i];
                    nums[i]=nums[i]+1+nums[i-1]-nums[i];
                    ans=ans+t;
                }
            }
        }
        System.out.println(ans);
    }
}
