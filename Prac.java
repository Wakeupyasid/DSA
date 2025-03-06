import java.awt.*;
import java.util.*;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        int hours[]={0,1,2,3,4};
        int target=2;
        int ans=0;
        for (int i=0;i< hours.length;i++){
            if (hours[i]>=target){
                ans++;
            }
        }
    }
}
