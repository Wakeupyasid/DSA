import java.awt.*;
import java.util.*;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
         int grid[][]={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
         int ans=0;
         for (int i=0;i< grid.length;i++){
             for (int j=0;j<grid[i].length;j++){
                 if (grid[i][j]<0){
                     ans++;
                 }
             }
         }
        System.out.println(ans);
    }
}
