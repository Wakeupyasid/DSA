public class lc2980 {
    // 2980. Check if Bitwise OR Has Trailing Zeros
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int c=0;
        for (int i=0;i< nums.length;i++){
            String b = Integer.toBinaryString(nums[i]);
            if (b.charAt(b.length()-1)=='0'){
                c++;
            }
            if (c==2){
                break;
            }
        }
        boolean ans=false;
        if (c==2){
            ans=true;
        }
        System.out.println(ans);
    }
}
