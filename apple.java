import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        int nums[]={1,1,2,4,9};
        int k=9;
        int ans=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]<k){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
