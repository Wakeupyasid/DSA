public class lc2124 {
    // 2124. Check if All A's Appears Before All B's
    public static void main(String[] args) {
        String s = "bbb";
        boolean ans=true;
        if (s.contains("ba")){
            ans=false;
        }
        System.out.println(ans);
    }
}
