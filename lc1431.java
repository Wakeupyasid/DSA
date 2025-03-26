import java.util.ArrayList;
import java.util.List;

public class lc1431 {
    // 1431. Kids With the Greatest Number of Candies
    public static void main(String[] args) {
        int candies[]={4,2,1,1,2};
        int extraCandies = 1;
        int maxVal=0;
        for (int i=0;i<candies.length;i++){
            maxVal=Math.max(maxVal,candies[i]);
        }
        List<Boolean> ans=new ArrayList<>();
        for (int i=0;i<candies.length;i++){
            int k=candies[i]+extraCandies;
            if (k>=maxVal){
                ans.add(true);
            }
            else ans.add(false);
        }
        System.out.println(ans);
    }
}
