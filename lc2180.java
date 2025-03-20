public class lc2180 {
//    2180. Count Integers With Even Digit Sum
    public static void main(String[] args) {
        int num=30;
        int ans=0;
        for (int i=1;i<=num;i++){
            int t=0;
            int p=i;
            while (p>0){
                t=t+p%10;
                p=p/10;
            }
            if (t%2==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
