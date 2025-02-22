import java.util.*;


public class lc217 {
    public static void main(String[] args) {
//        217. Contains Duplicate
        int nums[]={1,2,3,4};
        Set<Integer> c=new HashSet<>();
        for (int i=0;i< nums.length;i++){
            c.add(nums[i]);
        }
        boolean ans=true;
        if (nums.length==c.size()){
            ans=false;
        }
        System.out.println(ans);
    }
}
