public class lc2894 {
//    2894. Divisible and Non-divisible Sums Difference
    public static void main(String[] args) {
        int n=10;
        int m=3;
        int num1=0;
        int num2 =0;
        for (int i=1;i<=n;i++){
            if (i%m!=0){
                num1=num1+i;
            } else if (i%m==0) {
                num2=num2+i;
            }
        }
        int ans=num1-num2;
        System.out.println(ans);
    }
}
