import java.util.ArrayList;
import java.util.Arrays;

public class lc1089 {
    public static void main(String[] args) {
//        1089. Duplicate Zeros
        int arr[]={1,0,2,3,0,4,5,0};
        ArrayList<Integer> a=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                a.add(arr[i]);
            }
            else if (arr[i]==0) {
                a.add(0);
                a.add(0);
            }
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=a.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
