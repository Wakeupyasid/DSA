public class lc3065 {
    // 3065. Minimum Operations to Exceed Threshold Value I
    public static void main(String[] args) {
        int nums[]={1,1,2,4,9};
        int k=9;
        int ans=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]<k){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
