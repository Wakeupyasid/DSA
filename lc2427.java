public class lc2427 {
    // 2427. Number of Common Factors
    public static void main(String[] args) {
        int a = 25, b = 30;
        int ans=0;
        for (int i=1;i<=Math.min(a,b);i++){
            if (a%i==0 && b%i==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
