import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        int nums[]={2,7,9};
        int originals=4;
        Arrays.sort(nums);
        int ans=originals;
        for (int i=0;i< nums.length;i++){
            if (nums[i]==ans){
                ans=ans*2;
            }
        }
        System.out.println(ans);
    }
}
