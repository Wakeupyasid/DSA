import java.util.HashMap;
import java.util.Map;

public class lc3005 {
    // 3005. Count Elements With Maximum Frequency
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};

        Map<Integer, Integer> mp = new HashMap<>();
        int n=nums.length;
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
        int m=0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            if (entry.getValue()>m){
                m= entry.getValue();
            }
        }
        int ans=0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            if (entry.getValue()==m){
                ans=ans+m;
            }
        }
        System.out.println(ans);
    }
}
