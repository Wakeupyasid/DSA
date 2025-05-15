public class lc202 {
    // 202. Happy Number
    public static void main(String[] args) {
        int n=2;
        boolean ans=false;
        while (n>2){
            int t=n;
            int s=0;
            while (t>0){
                s=s+((t%10)*(t%10));
                t=t/10;
            }
            n=s;
        }
        if (n==1){
            ans=true;
        }
        System.out.println(ans);
    }
}
