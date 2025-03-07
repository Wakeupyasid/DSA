public class lc2652 {
//    2652. Sum Multiples
    public static void main(String[] args) {
        int n=7;
        int ans=0;
        for (int i=1;i<=n;i++){
            if (i%3==0 || i%5==0 || i%7==0){
                ans=ans+i;
            }
        }
        System.out.println(ans);
    }
}
