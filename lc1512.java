public class lc1512 {
    public static void main(String[] args) {
//        1512. Number of Good Pairs
        int nums[]={1,2,3,1,1};
        int ans=0;
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j< nums.length;j++){
                if ((nums[i] == nums[j]) && (i<j)){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
