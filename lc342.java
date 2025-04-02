public class lc342 {
    public static void main(String[] args) {
        int n=3;
        boolean ans=false;
        for (int i=0;i<=n;i++){
            if (Math.pow(4,i)==n){
                ans=true;
                break;
            }
            if (Math.pow(4,i)>n){
                break;
            }
        }
        System.out.println(ans);
    }
}
