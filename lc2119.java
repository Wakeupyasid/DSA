public class lc2119 {
//    2119. A Number After a Double Reversal
    public static void main(String[] args) {
        int num=526;
        int t=num;
        int res=0;
        while(num != 0) {
            int digit = num % 10;
            res= res * 10 + digit;
            num /= 10;
        }
        int res1=0;
        while(res != 0) {
            int digit = res % 10;
            res1= res1 * 10 + digit;
            res /= 10;
        }
        boolean ans=true;
        if (res1!=t){
            ans=false;
        }
        System.out.println(ans);
    }
}
