import java.util.Arrays;

public class lc1051 {
    public static void main(String[] args) {
//        1051. Height Checker
        int heights[]={5,1,2,3,4};
        int b=0;
        int ans[]=new int[heights.length];
        for (int i=0;i< heights.length;i++){
            ans[i]=heights[i];
        }
        Arrays.sort(heights);
        for (int i=0;i< heights.length;i++){
            if (heights[i]!=ans[i]){
                b++;
            }
        }
        System.out.println(b);
    }
}
