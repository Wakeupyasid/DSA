import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,10};
        int sn=0;
        int dn=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]>9){
                dn=dn+nums[i];
            }
            else {
                sn=sn+nums[i];
            }
        }
        boolean ans=true;
        if (dn==sn){
            ans=false;
        }
        System.out.println(ans);
    }
}
