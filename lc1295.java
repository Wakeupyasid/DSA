public class lc1295 {
    public static void main(String[] args) {
//        1295. Find Numbers with Even Number of Digits
        int nums[]={555,901,482,1771};
        int ans=0;
        for (int i =0;i<nums.length;i++){
            int c=0;
            while (nums[i] > 0) {
                int remainder = nums[i] % 10;
                nums[i] = nums[i] / 10;
                c++;
            }
            if (c%2==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
