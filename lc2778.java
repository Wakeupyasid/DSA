public class lc2778 {
    public static void main(String[] args) {
//        2778. Sum of Squares of Special Elements
        int nums[]={2,7,1,19,18,3};
        int n=nums.length;
        int ans=0;
        for (int i=0;i<nums.length;i++){
            if (n%(i+1)==0){
                ans=ans+(nums[i]*nums[i]);
            }
        }
        System.out.println(ans);
    }
}
