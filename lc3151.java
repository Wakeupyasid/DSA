public class lc3151 {
    public static void main(String[] args) {
//        3151. Special Array I
        int nums[]={4};
        boolean ans=true;
        if (nums.length==1){
            ans=true;
        }
        else if (nums.length>1){
            for (int i =0;i<nums.length-1;i++){
                if ( (nums[i]%2==0 && nums[i+1]%2==0) || (nums[i]%2!=0 && nums[i+1]%2!=0) ){
                    ans=false;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
