public class lc1952 {
    // 1952. Three Divisors
    public static void main(String[] args) {
        int n=2;
        int a=0;
        boolean ans=true;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                a++;
            }
            if (a>3){
                break;
            }
        }
        if (a!=3){
            ans=false;
        }
        System.out.println(ans);
    }
}
