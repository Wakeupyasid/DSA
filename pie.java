import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pie {
    public static void main(String[] args) {
        int nums[]={4,2,5,7};
        List<Integer> o=new ArrayList<>();
        List<Integer>e=new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            if (nums[i]%2==0){
                e.add(nums[i]);
            }
            else{
                o.add(nums[i]);
            }
        }
        int a=0;
        int b=0;
        int ans[]=new int[nums.length];
        for (int i=0;i<ans.length;i++){
            if (i%2==0){
                ans[i]=e.get(a++);
            }
            else{
                ans[i]=o.get(b++);
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
