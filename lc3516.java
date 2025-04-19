public class lc3516 {
    // 3516. Find Closest Person
    public static void main(String[] args) {
        int x = 1, y = 5, z = 3;
        int a=Math.abs(x-z);
        int b=Math.abs(y-z);
        int ans=0;
        if (a<b){
            ans=1;
        }
        else if (b<a){
            ans=2;
        }
        System.out.println(ans);
    }
}
