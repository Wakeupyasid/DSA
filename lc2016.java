public class lc2016 {
    // 2016. Maximum Difference Between Increasing Elements
    public static void main(String[] args) {
        int nums[]={7,1,5,4};
        int ans=-1;
        for (int i=0;i< nums.length-1;i++){
            for (int j=i+1;j< nums.length;j++){
                int a=nums[i];
                int b=nums[j];
                if (a<b){
                    int c=b-a;
                    ans=Math.max(ans,c);
                }
            }
        }
        System.out.println(ans);
    }
}
