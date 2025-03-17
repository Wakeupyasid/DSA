public class lc1281 {
//    1281. Subtract the Product and Sum of Digits of an Integer
    public static void main(String[] args) {
        int n=4421;
        int s=0;
        int m=1;
        while (n>0){
            s=s+(n%10);
            m=m* (n%10);
            n=n/10;
        }
        int ans=m-s;
        System.out.println(ans);
    }
}
