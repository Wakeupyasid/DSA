import java.util.ArrayList;
import java.util.*;

public class Prac {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int k=1;
        int ans=0;
        for (int i=0;i< nums.length;i++){
            for (int j=i;j< nums.length;j++){
                if (i!=j && nums[i]==nums[j]){
                    int t=i*j;
                    if (t%k==0){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
