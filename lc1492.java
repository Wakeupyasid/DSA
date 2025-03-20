import java.util.ArrayList;
import java.util.List;

public class lc1492 {
//    1492. The kth Factor of n
    public static void main(String[] args) {
        int n=12;
        int k=3;
        List<Integer> a=new ArrayList<>();
        for (int i=1;i<=n;i++){
            if (n%i==0){
                a.add(i);
            }
        }
        int ans=-1;
        if (a.size()>=k){
            ans=a.get(k-1);
        }
        System.out.println(a);
        System.out.println(ans);
    }
}
