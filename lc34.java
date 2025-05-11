import java.util.Arrays;
import java.util.Stack;

public class lc34 {
    // 34. Find First and Last Position of Element in Sorted Array
    public static void main(String[] args) {
        int nums[]={1,1,1};
        int target=1;
        Stack<Integer> a=new Stack<>();
        int ans[]= {-1,-1};
        for (int i=0;i< nums.length;i++){
            if (nums[i]==target){
                a.push(i);
            }
            else if (nums[i]>target) {
                break;
            }
        }
        if (!a.isEmpty()){
            ans[0]=a.getFirst();
            ans[1]=a.getLast();
        }
        System.out.println(Arrays.toString(ans));
    }
}
