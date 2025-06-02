public class lc154 {
    // 154. Find Minimum in Rotated Sorted Array II
    public static void main(String[] args) {
        int nums[]={1,3,5};
        int min=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            if (nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println(min);
    }
}
