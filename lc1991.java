public class lc1991 {
    // 1991. Find the Middle Index in Array
    public static void main(String[] args) {
        int nums[]={2,5};
        int ans=-1;
        for (int i=0;i< nums.length;i++){
            int l=0;
            for (int j=0;j<i;j++){
                l=l+nums[j];
            }
            int r=0;
            for (int j=i+1;j< nums.length;j++){
                r=r+nums[j];
            }
            if (l==r){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
