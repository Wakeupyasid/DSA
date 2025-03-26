public class lc35 {
    // 35. Search Insert Position
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target=2;
        int ans=0;
        if (nums[nums.length-1]<target){
            ans=nums.length;
        }
        else {
            for (int i=0;i< nums.length;i++){
                if (nums[i]==target){
                    ans=i;
                    break;
                }
                else if (nums[i]>target){
                    ans=i;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
