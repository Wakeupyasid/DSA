import java.math.BigInteger;
import java.util.*;

public class apple {
    public static void main(String[] args) {
        String arr[]={"d","b","c","b","c","a"};
        int k=2;
        int p=0;
        String ans="";
        for (int i=0;i< arr.length;i++){
            int c=0;
            for (int j=0;j< arr.length;j++){
                if (arr[i].equals(arr[j])){
                    c++;
                }
            }
            if (c==1){
                p++;
                if (p==k){
                    ans=arr[i];
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
