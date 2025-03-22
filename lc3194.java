import java.util.Arrays;

public class lc3194 {
    // 3194. Minimum Average of Smallest and Largest Elements
    public static void main(String[] args) {
        int nums[]={1,9,8,3,10,5};
        Arrays.sort(nums);
        double a[]=new double[nums.length/2];
        for (int i=0;i< nums.length/2;i++){
            double t=nums[i]+nums[nums.length-i-1];
            a[i]=t/2;
        }
        Arrays.sort(a);
        double ans=a[0];
        System.out.println(ans);
    }
}
