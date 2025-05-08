public class lc796 {
    // 796. Rotate String
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        boolean ans=false;
        for (int i=1;i<goal.length();i++){
            String t=goal.substring(i,goal.length())+goal.substring(0,i);
            if (t.equals(s)){
                ans=true;
                break;
            }
        }
        System.out.println(ans);
    }
}
