public class lc33 {
    // 33. Search in Rotated Sorted Array
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        int ans=-1;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
