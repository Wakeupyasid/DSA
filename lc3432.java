public class lc3432 {
    // 3432. Count Partitions with Even Sum Difference
    public static void main(String[] args) {
        int nums[]={2,4,6,8};
        int k=0;
        for (int i=0;i< nums.length;i++){
            int r=0;
            for (int j=0;j<=i;j++){
                r=r+nums[j];
            }
            int l=0;
            for (int j=i+1;j< nums.length;j++){
                l=l+nums[j];
            }
            if ((r-l)%2==0){
                k++;
            }
        }
        if (k!=0){
            k--;
        }
    }
}
