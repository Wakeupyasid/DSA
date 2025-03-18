import java.util.ArrayList;
import java.util.*;

public class Prac {
    public static void main(String[] args) {
        int nums[]={1,3,6,10,12,15};
        int ans=0;
        int c=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2==0 && nums[i]%3==0){
                ans=ans+nums[i];
                c++;
            }
        }
        if (c!=0){
            ans=ans/c;
        } else {
            ans=ans;
        }
        System.out.println(ans);
    }
}
