import java.util.*;

public class Q2 {
    public static void main(String[] args) {
//        136. Single Number
        int nums[]={2,2,1,1,5};
        int ans=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i =0;i< nums.length;i++){
            if (hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
                hm.put(nums[i],1);
        }
        for (Map.Entry<Integer,Integer> e: hm.entrySet()){
            if (e.getValue()==1){
                ans=e.getKey();
            }
        }
        System.out.println(ans);
    }
}
