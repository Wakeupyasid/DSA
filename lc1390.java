public class lc1390 {
    public static void main(String[] args) {
//        3190. Find Minimum Operations to Make All Elements Divisible by Three
        int nums[]={3,6,9};
        int ans=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%3!=0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
