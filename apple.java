import java.util.Arrays;

public class apple {
    public static void main(String[] args) {
        int flowerbed[]={1,0,0,0,1};
        int n=1;
        boolean ans;
        if ( flowerbed.length<=3){
            ans=false;
        }
        else {
            if (flowerbed[0]==0){

            }
            else if (flowerbed[0]==1){
                for (int i=0;i< flowerbed.length-2;i=i+1){
                    System.out.println(flowerbed[i]);
                }
            }
        }
    }
}
