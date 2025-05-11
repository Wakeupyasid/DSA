import java.math.BigInteger;
import java.util.*;

public class apple {
    public static void main(String[] args) {
        int nums[]={1,1,1};
        int target=1;
        Stack<Integer>a=new Stack<>();
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
//        int ans[]= {-1,-1};
//        if (nums.length>=2){
//            int c=0;
//            for (int i=0;i< nums.length;i++){
//                if (nums[i]==target && c!=2){
//                    ans[c++]=i;
//                    break;
//                }
//                if (c==2){
//                    break;
//                }
//            }
//            for (int i=0;i< nums.length;i++){
//                if (nums[i]==target && c!=2){
//                    ans[c++]=i;
//                    break;
//                }
//                if (c==2){
//                    break;
//                }
//            }
//        }
//        if (nums.length==1){
//            if (nums[0]==target){
//                ans[0]=0;
//                ans[1]=0;
//            }
//        }
//        System.out.println(Arrays.toString(ans));
    }
}
