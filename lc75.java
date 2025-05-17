import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lc75 {
    // 75. Sort Colors
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : nums) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        int k=0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            for (int i=1;i<= entry.getValue();i++){
                nums[k++]=entry.getKey();
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
