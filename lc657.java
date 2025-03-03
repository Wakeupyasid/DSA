public class lc657 {
//    657. Robot Return to Origin
    public static void main(String[] args) {
        String moves="LL";
        int cu=0;
        int cd=0;
        int cl=0;
        int cr=0;
        boolean ans=false;
        for (int i=0;i<moves.length();i++){
            if (moves.charAt(i)=='U'){
                cu++;
            }
            else if (moves.charAt(i)=='D') {
                cd++;
            }
            else if (moves.charAt(i)=='L') {
                cl++;
            }
            else if (moves.charAt(i)=='R') {
                cr++;
            }
        }
        if (cu==cd && cl==cr){
            ans=true;
        }
        System.out.println(ans);
    }
}
