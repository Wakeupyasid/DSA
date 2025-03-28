public class lc747 {
    // 747. Largest Number At Least Twice of Others
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int m=0;
        int mi=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]>m){
                m=nums[i];
                mi=i;
            }
        }
        boolean a=true;
        for (int i=0;i< nums.length;i++){
            if (i!=mi){
                if (nums[i]*2>m){
                    a=false;
                    break;
                }
            }
        }
        int ans=-1;
        if (a==true){
            ans=mi;
        }
        System.out.println(ans);
    }
}
