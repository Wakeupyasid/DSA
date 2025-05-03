import java.util.Stack;

public class lc844 {
    // 844. Backspace String Compare
    public static void main(String[] args) {
        String s = "xywrrmp", t = "xywrrmu#p";
        Stack<String> a=new Stack<>();
        Stack<String>b=new Stack<>();
        for (int i=0;i<s.length();i++){
            String k= String.valueOf(s.charAt(i));
            if (k.equals("#")){
                if (a.size()>0){
                    a.pop();
                }
            }
            else a.push(k);
        }
        for (int i=0;i<t.length();i++){
            String k= String.valueOf(t.charAt(i));
            if (k.equals("#")){
                if (b.size()>0){
                    b.pop();
                }
            }
            else b.push(k);
        }
        boolean ans=true;
        System.out.println(ans);
    }
}
