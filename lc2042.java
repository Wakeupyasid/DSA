import java.util.ArrayList;
import java.util.List;

public class lc2042 {
    // 2042. Check if Numbers Are Ascending in a Sentence
    public static void main(String[] args) {
        String s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        String[] arr = s.split(" ");
        List<Integer> a=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (arr[i].charAt(0)>=48 && arr[i].charAt(0)<=57){
                a.add(Integer.valueOf(arr[i]));
            }
        }
        boolean ans=true;
        for (int i=0;i<a.size()-1;i++){
            if (a.get(i)>=a.get(i+1)){
                ans=false;
                break;
            }
        }
        System.out.println(ans);
    }
}
