import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc1207 {
    //    1207. Unique Number of Occurrences
    public static void main(String[] args) {
        int arr[] = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        List<Integer> a = new ArrayList<>();
        Arrays.sort(arr);
        boolean ans = true;
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    c++;
                }
            }
            if (a.contains(c)) {
                ans = false;
                break;
            }
            i = i + c - 1;
            a.add(c);
        }
        System.out.println(ans);
    }
}
