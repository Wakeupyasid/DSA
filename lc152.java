public class lc152 {
    // 152. Maximum Product Subarray
    public static void main(String[] args) {
        int nums[]={-2};
        int ans=Integer.MIN_VALUE;
        for (int i=0;i< nums.length;i++){
            int c=1;
            for (int j=i;j< nums.length;j++){
                c=c*nums[j];
                if (c>ans){
                    ans=c;
                }
            }
        }
        System.out.println(ans);
    }
}
