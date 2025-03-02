public class lc1437 {
    public static void main(String[] args) {
        int nums[]={1,0,0,0,1,0,0,1};
        int k=2;
        int j = -(k + 1);
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                if (i - j - 1 < k) {
//                    return false;
                }
                j = i;
            }
        }
//        return true;
    }
}
