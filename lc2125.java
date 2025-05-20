import java.util.ArrayList;
import java.util.List;

public class lc2125 {
    // 2125. Number of Laser Beams in a Bank
    public static void main(String[] args) {
        String []bank={"011001","000000","010100","001000"};
        List<Integer> a=new ArrayList<>();
        for (int i=0;i< bank.length;i++){
            int k=0;
            for (int j=0;j<bank[i].length();j++){
                if (bank[i].charAt(j)=='1'){
                    k++;
                }
            }
            if (k!=0){
                a.add(k);
            }
        }
        int ans=0;
        if (!a.isEmpty()){
            for (int i=0;i<a.size()-1;i++){
                ans=ans+(a.get(i)*a.get(i+1));
            }
        }
        System.out.println(ans);
    }
}
