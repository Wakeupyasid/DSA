public class lc744 {
    // 744. Find Smallest Letter Greater Than Target
    public static void main(String[] args) {
        char letters[]={'c','f','j'};
        char target='a';
        char ans=' ';
        for (int i=0;i< letters.length;i++){
            if (letters[i]>target){
                ans=letters[i];
                break;
            }
        }
        if (ans==' '){
            ans=letters[0];
        }
        System.out.println(ans);
    }
}
