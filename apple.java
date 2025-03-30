import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        int nums[]={1,1,2};

        List<Integer>a=new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            if (!a.contains(nums[i])){
                a.add(nums[i]);
            }
        }
        int ans=a.size();
        for (int i=0;i< a.size();i++){
            nums[i]=a.get(i);
        }
        System.out.println(ans);
        System.out.println(Arrays.toString(nums));
    }
}
