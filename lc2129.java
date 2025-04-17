import java.util.Arrays;

public class lc2129 {
    // 2129. Capitalize the Title
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";
        String[] arr = title.split(" ");
        for (int i=0;i<arr.length;i++){
            if (arr[i].length()<=2){
                arr[i]=arr[i].toLowerCase();
            }
            else {
                arr[i]=arr[i].toLowerCase();
                String firstLetter = arr[i].substring(0, 1);
                String remainingLetters = arr[i].substring(1, arr[i].length());
                firstLetter = firstLetter.toUpperCase();
                arr[i] = firstLetter + remainingLetters;
            }
        }
        String ans=arr[0];
        for (int i=1;i<arr.length;i++){
            ans=ans+" "+arr[i];
        }
    }
}
