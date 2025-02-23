public class lc507 {
    public static void main(String[] args) {
//        507. Perfect Number
        int num=7;
        int sum=0;
        boolean ans=false;
        for (int i=1;i<=num/2;i++){
            if (num%i==0){
                sum=sum+i;
            }
        }
        if (sum==num){
            ans=true;
        }
        System.out.println(ans);
    }
}
