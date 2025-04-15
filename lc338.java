import java.util.Arrays;

public class lc338 {
    // 338. Counting Bits
    public static void main(String[] args) {
        int n=5;
        int ans[]=new int[n+1];
        for (int i=0;i<=n;i++){
            int a=0;
            String s=Integer.toBinaryString(i);
            for (int j=0;j<s.length();j++){
                if (s.charAt(j)=='1'){
                    a++;
                }
            }
            ans[i]=a;
        }
        System.out.println(Arrays.toString(ans));
    }
}
