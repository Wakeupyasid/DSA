import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc2293 {
    // 2293. Min Max Game
    public static void main(String[] args) {
        int nums[]={70,38,21,22};
        List<Integer> a=new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            a.add(nums[i]);
        }
        while (a.size()>1){
            List<Integer>b=new ArrayList<>();
            int k=0;
            for (int i=0;i<a.size()-1;i=i+2){
                if (k==0){
                    b.add(Math.min(a.get(i),a.get(i+1)));
                    k=1;
                }
                else if (k==1){
                    b.add(Math.max(a.get(i),a.get(i+1)));
                    k=0;
                }
            }
            a.clear();
            for (int i=0;i<b.size();i++){
                a.add(b.get(i));
            }
        }
        int ans[]={a.getFirst()};
        System.out.println(Arrays.toString(ans));
    }
}
