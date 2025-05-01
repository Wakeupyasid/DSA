import java.util.*;
public class lc682 {
    public static void main(String[] args) {
        String operations[]={"5","2","C","D","+"};
        List<Integer> a=new ArrayList<>();
        for (int i=0;i< operations.length;i++){
            if (operations[i]=="+"){
                a.add(a.get(a.size()-1)+a.get(a.size()-2));
            }
        }
    }
}
