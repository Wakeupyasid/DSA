import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target=2;
        int ans=0;
        if (nums[nums.length-1]<target){
            ans=nums.length;
        }
        else {
            for (int i=0;i< nums.length;i++){
                if (nums[i]==target){
                    ans=i;
                    break;
                }
                else if (nums[i]>target){
                    ans=i;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
