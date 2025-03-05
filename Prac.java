import java.awt.*;
import java.util.*;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};
        Arrays.sort(nums);
        List<Integer>a=new ArrayList<>();
        Set<Integer>b=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            b.add(nums[i]);
        }
        for (int i=1;i<nums.length+1;i++){
            if (!b.contains(i)){
                a.add(i);
            }
        }
        System.out.println(a);
    }
}
