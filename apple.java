import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        int nums[]={0};
        int ans=0;
        if (nums.length>1){
            for (int i=1;i< nums.length;i++){
                if (nums[i]<=nums[i-1]){
                    int t=1+nums[i-1]-nums[i];
                    nums[i]=nums[i]+1+nums[i-1]-nums[i];
                    ans=ans+t;
                }
            }
        }
        System.out.println(ans);
    }
}
