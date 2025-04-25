import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lc2341 {
    // 2341. Maximum Number of Pairs in Array
    public static void main(String[] args) {
        int nums[]={0};
        int ans[]=new int[2];
        int n= nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(nums[i]))
            {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }
            else
            {
                mp.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            int k= entry.getValue();
            while (k>1){
                k=k-2;
                ans[0]++;
            }
            if (k==1){
                ans[1]++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
