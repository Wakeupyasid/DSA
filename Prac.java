import java.util.ArrayList;
import java.util.*;

public class Prac {
    public static void main(String[] args) {
        int nums[]={-1,1};
        List<Integer>p=new ArrayList<>();
        List<Integer>n=new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            if (nums[i]>0){
                p.add(nums[i]);
            } else if (nums[i]<0) {
                n.add(nums[i]);
            }
        }
        int c=0;
        for (int i=0;i< nums.length;i=i+2){
            nums[i]=p.get(c);
            nums[i+1]=n.get(c);
            c++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
