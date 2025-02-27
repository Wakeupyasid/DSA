import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc1822 {
    public static void main(String[] args) {
//        1822. Sign of the Product of an Array
        int nums[]={-1,-2,-3,-4,3,2,1};
        int ans;
        Arrays.sort(nums);
        List<Integer> a=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        if (a.contains(0)){
            ans=0;
        }
        else  {
            int c=0;
            for (int i=0;i<a.size();i++){
                if (a.get(i)<0){
                    c++;
                }
                else{
                    break;
                }
            }
            if (c%2==0){
                ans=1;
            }
            else {
                ans=-1;
            }
        }

//        List<Integer> a=new ArrayList<>();
//        for (int i=0;i<nums.length;i++){
//            a.add(nums[i]);
//        }
//        if (a.contains(0)){
//            ans=0;
//        }
//        else  {
//            int c=0;
//            for (int i=0;i<a.size();i++){
//                if (a.get(i)<0){
//                    c++;
//                }
//                else{
//                    break;
//                }
//            }
//            if (c%2==0){
//                ans=1;
//            }
//            else {
//                ans=-1;
//            }
//        }
        System.out.println(ans);
    }
}
