import java.util.Arrays;

public class lc344 {
//    344. Reverse String
    public static void main(String[] args) {
        char s[]={'h','e','l','l','o'};
        int n=s.length;
        Character ans[]=new Character[s.length];
        for (int i=0;i<n;i++){
            ans[n-i-1]=s[i];
        }
        for (int i=0;i<n;i++){
            s[i]=ans[i];
        }
        System.out.println(Arrays.toString(s));
    }
}
