import java.awt.*;
import java.util.*;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        String haystack="sadbutsad";
        String needle="needle";
        int ans=-1;
        for (int i=0;i<haystack.length()-needle.length()+1;i++){
            if (haystack.substring(i, i + needle.length()).equals(needle)){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
