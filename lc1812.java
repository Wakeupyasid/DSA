public class lc1812 {
    // 1812. Determine Color of a Chessboard Square
    public static void main(String[] args) {
        String coordinates = "h3";
        int a=coordinates.charAt(0);
        int b=coordinates.charAt(1);
        int c=a+b;
        boolean ans=true;
        if (c%2==0){
            ans=false;
        }
        System.out.println(ans);
    }
}
