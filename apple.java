import java.util.*;

public class apple {
    public static void main(String[] args) {
        String s = "aababcabc";
        int ans=0;
        for (int i=0;i<s.length()-2;i++){
            if (s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i+2) && s.charAt(i+1)!=s.charAt(i+2)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
