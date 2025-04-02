public class lc3099 {
    // 3099. Harshad Number
    public static void main(String[] args) {
        int x=23;
        int t=x;
        int s=0;
        while (x>0){
            s=s+x%10;
            x=x/10;
        }
        int ans=-1;
        if (t%s==0){
            ans=s;
        }
        System.out.println(ans);
    }
}
