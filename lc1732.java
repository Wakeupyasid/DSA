import java.util.Arrays;

public class lc1732 {
    // 1732. Find the Highest Altitude
    public static void main(String[] args) {
        int gain[] = {-5,1,5,0,-7};
        int a[] = new int[gain.length + 1];
        a[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            a[i + 1] = gain[i] + a[i];
        }
        Arrays.sort(a);
        int ans=a[a.length-1];
        System.out.println(ans);
    }
}
