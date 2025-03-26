public class lc3232 {
    // 3232. Find if Digit Game Can Be Won
    public static void main(String[] args) {
        int nums[]={1,2,3,4,10};
        int sn=0;
        int dn=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]>9){
                dn=dn+nums[i];
            }
            else {
                sn=sn+nums[i];
            }
        }
        boolean ans=true;
        if (dn==sn){
            ans=false;
        }
        System.out.println(ans);
    }
}
