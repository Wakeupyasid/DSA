import java.util.ArrayList;
import java.util.*;

public class Prac {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans="";
        for (int i=0;i<address.length();i++){
            if (address.charAt(i)=='.'){
                ans=ans+"[.]";
            }
            else{
                ans=ans+address.charAt(i);
            }
        }
//        address=address.replace(".","[.]");
        System.out.println(ans);
        System.out.println(address);
    }
}
