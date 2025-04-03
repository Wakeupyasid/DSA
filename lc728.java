import java.util.ArrayList;
import java.util.List;

public class lc728 {
    // 728. Self Dividing Numbers
    public static void main(String[] args) {
        int left = 66, right = 708;
        List<Integer> m=new ArrayList<>();
        for (int i=left;i<=right;i++){
            if (i%10!=0){
                boolean a=true;
                int t=i;
                while (t>0){
                    int k=t%10;
                    if(t%10==0){
                        a=false;
                        break;
                    }
                    if (i%k!=0){
                        a=false;
                        break;
                    }
                    t=t/10;
                }
                if (a==true){
                    m.add(i);
                }
            }
        }
        System.out.println(m);
        System.out.println(m.size());
    }
}
