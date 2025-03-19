import java.util.*;
//2824. Count Pairs Whose Sum is Less than Target
public class lc2824 {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();
        int target=2;
        int ans=0;
        for (int i=0;i< nums.size();i++){
            for (int j=i;j< nums.size();j++){
                if (i!=j &&  nums.get(i)+nums.get(j)<target){
                    ans++;
                }
            }
        }
    }
}
