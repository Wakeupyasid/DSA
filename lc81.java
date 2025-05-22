public class lc81 {
    // 81. Search in Rotated Sorted Array II
    public static void main(String[] args) {
        int nums[]={2,5,6,0,0,1,2};
        int target=0;
        boolean ans=false;
        for (int i=0;i< nums.length;i++){
            if (nums[i]==target){
                ans=true;
                break;
            }
        }
        System.out.println(ans);
    }
}
