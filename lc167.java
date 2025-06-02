import java.util.Arrays;

public class lc167 {
    // 167. Two Sum II - Input Array Is Sorted
    public static void main(String[] args) {
        int numbers[]={2,7,11,15};
        int target=9;
        int ans[]=new int[2];
        for (int i=0;i< numbers.length-1;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[i]+numbers[j]==target){
                    ans[0]=i+1;
                    ans[1]=j+1;
                    break;
                }
                else if(numbers[i]+numbers[j]>target){
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
