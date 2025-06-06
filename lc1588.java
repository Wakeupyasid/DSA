import java.util.ArrayList;
import java.util.List;

public class lc1588 {
    // 1588. Sum of All Odd Length Subarrays
    public static void main(String[] args) {
        int arr[]={1,2};
        int ans=0;
        for (int i=0;i<arr.length;i++){
            List<Integer> a=new ArrayList<>();
            int k=0;
            for (int j=i;j<arr.length;j++){
                k=k+arr[j];
                a.add(arr[j]);
                if (a.size()%2!=0){
                    ans=ans+k;
                }
            }
        }
        System.out.println(ans);
    }
}
