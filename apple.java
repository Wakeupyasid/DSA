import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        int nums[]={-2};
        int ans=Integer.MIN_VALUE;
        for (int i=0;i< nums.length;i++){
            int c=1;
            for (int j=i;j< nums.length;j++){
                c=c*nums[j];
                if (c>ans){
                    ans=c;
                }
            }
        }
        System.out.println(ans);
    }
}
