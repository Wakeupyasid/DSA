public class lc485 {
    //    485. Max Consecutive Ones
    public static void main(String[] args) {
        int nums[]={1,1,0,0,1,1,1,1};
        int ans=0;
        for (int i=0;i<nums.length;i++){
            int c=0;
            if (nums[i]==1){
                for (int j=i;j< nums.length;j++){
                    if (nums[j]==nums[i]){
                        c++;
                    }

                    else{
                        break;
                    }
                }
            }
            i=i+c;
            ans=Math.max(ans,c);
        }
        System.out.println(ans);
    }
}
