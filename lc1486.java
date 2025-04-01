public class lc1486 {
    // 1486. XOR Operation in an Array
    public static void main(String[] args) {
        int n=4,start=3;
        int nums[]=new int[n];
        int ans=0;
        for (int i=0;i< nums.length;i++){
            nums[i]=start+(2*i);
            ans=ans^nums[i];
        }
        System.out.println(ans);
    }
}
