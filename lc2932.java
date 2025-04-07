public class lc2932 {
    // 2932. Maximum Strong Pair XOR I
    public static void main(String[] args) {
        int nums[]={10,100};
        int ans=0;
        for (int i=0;i< nums.length;i++){
            for (int j=i;j< nums.length;j++){
                if (Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    ans=Math.max(ans,(nums[i]^nums[j]));
                }
            }
        }
        System.out.println(ans);
    }
}
