import java.util.ArrayList;
import java.util.*;

public class Prac {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,0};
        int ans=-1;
        for (int i=0;i< nums.length;i++){
            if (i%10==nums[i]){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
