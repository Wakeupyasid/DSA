import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        int nums[]={1};
        int n= nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (mp.containsKey(nums[i]))
            {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }
            else
            {
                mp.put(nums[i], 1);
            }
        }
        List<Integer>a=new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            if (entry.getValue()>n/3){
                a.add(entry.getKey());
            }
        }
        System.out.println(a);
    }
}
