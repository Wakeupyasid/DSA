import java.util.Stack;

public class lc2390 {
    // 2390. Removing Stars From a String
    public static void main(String[] args) {
        String s = "leet**cod*e";
        Stack<String> a=new Stack<>();
        for (int i=0;i<s.length();i++){
            String p= String.valueOf(s.charAt(i));
            if (a.empty()){
                a.push(p);
            }
            else {
                if (p.equals("*")){
                    a.pop();
                }
                else {
                    a.push(p);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.size();i++)
        {
            sb.append(a.get(i));
        }
        String ans= String.valueOf(sb);
        System.out.println(sb);
    }
}
