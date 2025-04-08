import java.util.*;

public class apple {
    public static void main(String[] args) {
        int nums[]={14,70,53,83,49,91,36,80,92,51,66,70};
        int ans=0;
        for (int i=0;i< nums.length;i++){
            for (int j=i;j< nums.length;j++){
                ans=Math.max(ans,(nums[i]^nums[j]));
            }
        }
        System.out.println(ans);
    }
}
