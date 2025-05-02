import java.util.*;
public class lc682 {
    public static void main(String[] args) {
        String []operations={"1","C"};
        int ans=0;
        List<Integer>a=new ArrayList<>();
        for (int i=0;i< operations.length;i++){
            if (operations[i].equals("+") && a.size()>=2){
                int k=a.get(a.size()-1)+a.get(a.size()-2);
                a.add(k);
            }
            else if (operations[i].equals("D") && a.size()>=1){
                int k=a.get(a.size()-1)*2;
                a.add(k);
            }
            else if (operations[i].equals("C") && a.size()>=1) {
                a.removeLast();
            }
            else {
                int k=Integer.parseInt(operations[i]);
                a.add(k);
            }
        }
        for (int i=0;i<a.size();i++){
            ans=ans+a.get(i);
        }
        System.out.println(ans);
    }
}
