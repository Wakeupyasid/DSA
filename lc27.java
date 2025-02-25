public class lc27 {
    public static void main(String[] args) {
//        27. Remove Element
        int nums[]={0,1,2,2,3,0,4,2};
        int val=2;
        int arr[]=new int[nums.length];
        int ans=0;
        for (int i =0;i<nums.length;i++){
            if (nums[i]!=val){
                arr[ans]=nums[i];
                ans++;
            }
        }
        for (int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        System.out.println(ans);
    }
}
