import java.util.Arrays;

public class lc151 {
    // 151. Reverse Words in a String
    public static void main(String[] args) {
        String s = "  hello world  ";
        s=s.trim();
        String ans="";
        while (s.contains("  ")){
            s=s.replaceAll("  "," ");
        }
        String[] t = s.split(" ");
        System.out.println(Arrays.toString(t));
        for (int i=t.length-1;i>=0;i--){
            ans=ans+t[i]+" ";
        }
        ans=ans.trim();
        System.out.println(ans);
    }
}
