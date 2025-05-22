import java.util.Arrays;

public class lc242 {
    // 242. Valid Anagram
    public static void main(String[] args) {
        String s = "rat", t = "car";
        boolean ans=true;
        if (s.length()!=t.length()){
            ans=false;
        }
        else if (s.length()==t.length()){
            int k=s.length();
            char c1[]=new char[k];
            char c2[]=new char[k];
            for (int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                c1[i]=ch;
            }
            for (int i=0;i<t.length();i++){
                char ch=t.charAt(i);
                c2[i]=ch;
            }
            Arrays.sort(c1);
            Arrays.sort(c2);
            for (int i=0;i<c1.length;i++){
                if (c1[i]!=c2[i]){
                    ans=false;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
