public class lc326 {
    // 326. Power of Three
    public static void main(String[] args) {
        int n=3;
        boolean ans=false;
        for (int i=0;i<=n;i++){
            if (Math.pow(3,i)==n){
                ans=true;
                break;
            }
            if (Math.pow(3,i)>n){
                break;
            }
        }
        System.out.println(ans);
    }
}
