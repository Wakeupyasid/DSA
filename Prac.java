import java.awt.*;
import java.util.*;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        String s="Hello how are you Contestant";
        int k=4;
        String ans="";
        String p[]=s.split(" ");
        for (int i=0;i< k-1;i++){
            ans=ans+p[i]+" ";
        }
        ans=ans+p[k-1];
        System.out.println(ans);
    }
}
