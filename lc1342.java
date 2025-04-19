public class lc1342 {
    // 1342. Number of Steps to Reduce a Number to Zero
    public static void main(String[] args) {
        int num=123;
        int ans=0;
        while (num>0){
            if (num%2==0){
                num=num/2;
                ans++;
            } else if (num%2!=0){
                num=num-1;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
