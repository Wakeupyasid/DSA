import java.awt.*;
import java.util.*;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        int nums[]={0,1};
        int ans=0;
        List<Integer>a=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(nums[i]);
        }
        for (int i=1;i<=nums.length;i++){
            if (!a.contains(i)){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
