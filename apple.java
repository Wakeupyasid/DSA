import java.util.*;

public class apple {
    public static void main(String[] args) {
        int arr[]={5,1,6};
        List<Integer>a=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            int s=0;
            for (int j=i;j<arr.length;j++){
                s=s^arr[j];
                a.add(s);
            }
        }
        int ans=0;
        for (int i=0;i<a.size();i++){
            ans=ans+a.get(i);
        }
        System.out.println(ans);
    }
}
