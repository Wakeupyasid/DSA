import java.util.*;

public class apple {
    public static void main(String[] args) {
        int nums[]={3,3,7,7,10,11,11};
        List<Integer>a=new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            if (!a.contains(nums[i])){
                a.add(nums[i]);
            }
            else if (a.contains(nums[i])){
                a.removeLast();
            }
        }
        int ans=a.getFirst();
        System.out.println(ans);
    }
}
