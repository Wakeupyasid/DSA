public class lc2481 {
    // 2481. Minimum Cuts to Divide a Circle
    public static void main(String[] args) {
        int n=3;
        int ans=0;
        if (n==1){
            ans=0;
        }
        else if (n%2==0){
            ans=n/2;
        } else if (n%2!=0) {
            ans=n;
        }
        System.out.println(ans);
    }
}
